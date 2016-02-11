/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc668assignment1;
import java.util.Scanner;
import java.io.*;
import java.util.LinkedList;
import java.sql.Timestamp;


/**
 * allows the viewing of Invoices and recording of sales as invoices.
 * @author Karl
 */
public class SalesLog {
    final static String TRANSACTION_FILE_NAME = "transaction.txt"; 
    
    /**
     * shows all invoices in chronological order, assuming every Invoice is appended
     * to the file.
     */
    public void viewAllInvoices() throws FileNotFoundException{
        try (BufferedReader reader = new BufferedReader(new FileReader(TRANSACTION_FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                //TODO: use separate I/O call (not System.out) to display every line.
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        
    }
    /**
     * Scan through the .txt file, looking for and displaying all invoices
     * matching the name given.
     * @param name the name of the person's invoices
     */
    public void viewInvoice(String name)throws FileNotFoundException{
        Invoice inv = new Invoice();
        try (BufferedReader reader = new BufferedReader(new FileReader(TRANSACTION_FILE_NAME))) {
            String line;
            /*          EXECUTION LOOP TO PROCESS FILE  */
            line = reader.readLine();
            if(line.equals(name)){
                while(!line.equals("")){
                    //print the line
                }
            }
            while ((line = reader.readLine()) != null) {
                if(line.equals(name)){
                    while(!line.equals("")){
                        //print the line
                    }
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        /*
        
        */
    }
    /**
     * 
     * @param t the transaction invoice to be recorded. 
     */
    public void recordInvoice(Invoice t){
        
    }
    /*public void recordInvoice(String name, LinkedList<SalesLineItem> e, Timestamp ts, double subtotal, String payMethod){
        
    }*/
    
    
}
