
package csc668assignment1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Jie Li
 * Date: 2/11/2016
 * Purpose: build a transactionReader to read transaciton records from a file.
 */
public class TransactionReader {
    private BufferedReader in;
    private String line;
    private Transaction transaction;
    private String customerName;
    private String[] transItems_String;
    private int totalTransItems;
    private String payment;
    public TransactionReader(String transactionFile) throws FileNotFoundException{
        this.in = new BufferedReader(new FileReader(transactionFile));
    }
    public boolean hasMoreTransactions() throws IOException{
        this.line = this.in.readLine();//Always assume this is the line for Customer Name
        if(this.line != null){
            this.customerName = this.line;
            System.out.println(this.customerName);
            return true;
        }
        return false;
    }
    //need to fix
    //Right now I just make one instance of transaction for testing
    public Transaction getNextTransaction() throws IOException{
        this.totalTransItems = 0;
        this.transItems_String = new String[100];
        System.out.println(this.in.readLine());
        this.line = this.in.readLine();
        while(!this.line.startsWith("C")){
            this.transItems_String[this.totalTransItems++] = this.line;
            this.line = this.in.readLine();
        }
        //comes to the payment
        this.payment = this.line;
        
        //this.customerName = "Jie";
        //this.transItems_String = new String[2];
        //transItems_String[0] = "1001 2";
        //transItems_String[1] = "1002 1";
        //this.payment = "credit card";
        this.transaction =  new Transaction(customerName, transItems_String, payment);
        return this.transaction;
        
    }

    public static void main(String[] args) throws FileNotFoundException, IOException{
        TransactionReader tr = new TransactionReader("Transactions.txt");
        if(tr.hasMoreTransactions()){
             Transaction t = tr.getNextTransaction(); 
             System.out.println("printing transactoin items");
             t.printTransItems();
        }
       

    }
    
}
