/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc668assignment1;
//import java.io.*;
import java.util.LinkedList;
//import java.sql.Timestamp;


/**
 * allows the viewing of Invoices and recording of sales as invoices.
 * @author Karl
 */
public class SalesLog {
    //final static String TRANSACTION_FILE_NAME = "transaction.txt"; 
    private LinkedList<Invoice> invoiceList;
    /**
     * shows all invoices in chronological order, earliest to latest, assuming 
     * every Invoice is appended to the LinkedList.
     */
    public void viewAllInvoices(){
        int i,j;
        
        LinkedList<SalesLineItem> productList;
        if(invoiceList.isEmpty()){
            //print("No Records in Sales Log.");
            return;
        }else{
            for(i=invoiceList.size(); i>0;i--){
                /*print(invoiceList.get(i).getCustomerName()+"  "
                *    +invoiceList.get(i),getTimestamp());
                 println();
                for(j=0; j<invoiceList.get(i).getProductList().size();j++){
                    productList=invoiceList.get(i).getProductList();
                    print("<"productList.get(j).getProductSpec().getDescription()+" "
                            +productList.get(j).getQuantity()+" @ " 
                            +productList.get(j).getProductSpec().getUnitPrice()+" "
                            +productList.get(j).getSubtotal()+">");
                    println();
                }
                *
                **/
            }
        }
    }
    
    /**
     * Scan through the linked list, looking for and displaying all invoices
     * matching the name given.
     * @param name the name of the person's invoices
     */
    public void viewInvoice(String name){
        int i;
        if(invoiceList.isEmpty()){
            //print("No Records in Sales Log.")
            return;
        }
        for(i=invoiceList.size(); i>0;i--){
            if((invoiceList.get(i).getCustomerName().equals(name))){
                /*
                for(j=0; j<invoiceList.get(i).getProductList().size();j++){
                    productList=invoiceList.get(i).getProductList();
                    print("<"productList.get(j).getProductSpec().getDescription()+" "
                            +productList.get(j).getQuantity()+" @ " 
                            +productList.get(j).getProductSpec().getUnitPrice()+" "
                            +productList.get(j).getSubtotal()+">");
                    println();
                }
                */
            }
        }
    }
    
    /**
     * adds the Invoice object to a linked list of past sales.
     * @param t the transaction invoice to be recorded. 
     */
    public void recordInvoice(Invoice t){
        invoiceList.add(t);
    }
    
    
    
}
