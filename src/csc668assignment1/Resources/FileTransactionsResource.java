/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc668assignment1.Resources;

import csc668assignment1.Payment.CashPayment;
import csc668assignment1.Payment.CreditPayment;
import csc668assignment1.Payment.Payment;
import csc668assignment1.Transaction;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author axelanconaesselmann
 */
public class FileTransactionsResource extends TransactionsResource {
    protected BufferedReader _fileHandler;
    
    public FileTransactionsResource (String fileName) throws IOException {
        Path path = FileSystems.getDefault().getPath(fileName);
        try {
            _fileHandler = Files.newBufferedReader(path, StandardCharsets.UTF_8);
        } catch(IOException e){
            System.out.print("The file " + fileName + " could not be opened");
        }
    }
    
    @Override
    public boolean hasNext() {
        _currentUpc      = null;
        _currentQuantity = 0;
        _currentPayment  = null;
        _currentName     = null;
        try {
            String line = _fileHandler.readLine();
            _currentName = line;
            line = _fileHandler.readLine();
            _currentUpc      = line.substring(0,4);
            _currentQuantity = Integer.parseInt(line.substring(9,10));
            line = _fileHandler.readLine();
            if (line != null) {
                if (line.substring(1,5).equals("CASH")) {
                    _currentPayment = new CashPayment(Float.parseFloat(line.substring(13,20)));
                } else if (line.substring(1,5).equals("CRED")) {
                    _currentPayment = new CreditPayment(line.substring(8,12));
                } else _currentPayment = null;
            } else return false;
            line = _fileHandler.readLine(); // read blank line
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    @Override
    public void printTransaction(Transaction transaction) {
        System.out.printf("%s\n%s     %d\n%s\n\n", 
            transaction.getName(), 
            transaction.getUpc(), 
            transaction.getQuantity(),
            transaction.getPayment().toString()
        );
    }
    
}
