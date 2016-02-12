/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc668assignment1;
import java.io.*;
import java.util.LinkedList;
//import java.sql.Timestamp;
import csc668assignment1.UserInterface.UserInterface;
//import csc668assignment1.Resources.*;


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
        UserInterface ui = new UserInterface();
        Invoice current;
        SalesLineItem currentItem;
        LinkedList<SalesLineItem> productList;
        if(invoiceList.isEmpty()){
            //print("No Records in Sales Log.");
            return;
        }else{
            for(i=invoiceList.size(); i>0;i--){
                current = invoiceList.get(i);
                
                //printing salesLineItems for the current invoice
                for(j=0; j<current.getProductList().size();j++){
                    
                    productList=current.getProductList();
                    currentItem = productList.get(j);
                    ui.printToGeneralOut(null);
                    ui.printToGeneralOut("<"+currentItem.getProductSpec().getDescription()+" "
                        +currentItem.getQuantity()+" @ " 
                        +currentItem.getProductSpec().getUnitPrice()+" "
                        +currentItem.getSubtotal()+">");
                    ui.printToGeneralOut("\n");
                    
                    
                    
                    
                }
                //after all items printed, print subtotal and payment.
                ui.printToGeneralOut("-----\n");
                ui.printToGeneralOut("Total: "+current.getSubtotal());
                ui.printToGeneralOut("\n");
                if(current.getPaymentType().equals("cash")){
                    ui.printToGeneralOut("Cash Tendered: "+current.getAmountTendered());
                    ui.printToGeneralOut("\n");
                    ui.printToGeneralOut("Cash Returned: "+(current.getSubtotal()-current.getAmountTendered()));
                    ui.printToGeneralOut("\n");
                }else if(current.getPaymentType().equals("check")){
                    ui.printToGeneralOut("Paid by check");
                    ui.printToGeneralOut("\n");
                }else if(current.getPaymentType().equals("credit")){
                    ui.printToGeneralOut("Paid by Credit Card number: "+current.getCardNum());
                    ui.printToGeneralOut("\n");
            }
                
        }
    }
    }
    
    /**
     * Scan through the linked list, looking for and displaying all invoices
     * matching the name given.
     * @param name the name of the person's invoices
     */
    public void viewInvoice(String name){
        int i,j;
        Invoice current;
        UserInterface ui = new UserInterface();
        SalesLineItem currentItem;
        LinkedList<SalesLineItem> productList;
        if(invoiceList.isEmpty()){
            //print("No Records in Sales Log.")
            return;
        }
        
        for(i=invoiceList.size(); i>0;i--){
            current = invoiceList.get(i);
            if((current.getCustomerName().equals(name))){
                //printing salesLineItems for the current invoice
                for(j=0; j<current.getProductList().size();j++){
                   
                    productList=current.getProductList();
                    currentItem = productList.get(j);
                    ui.printToGeneralOut("<"+currentItem.getProductSpec().getDescription()+" "
                            +currentItem.getQuantity()+" @ " 
                            +currentItem.getProductSpec().getUnitPrice()+" "
                            +currentItem.getSubtotal()+">");
                    ui.printToGeneralOut("\n");
                    
                    
                    
                    
                }
                //after all items printed, print subtotal and payment.
                ui.printToGeneralOut("-----\n");
                ui.printToGeneralOut("Total: "+current.getSubtotal());
                ui.printToGeneralOut("\n");
                if(current.getPaymentType().equals("cash")){
                        ui.printToGeneralOut("Cash Tendered: "+current.getAmountTendered());
                        ui.printToGeneralOut("\n");
                        ui.printToGeneralOut("Cash Returned: "+(current.getSubtotal()-current.getAmountTendered()));
                        ui.printToGeneralOut("\n");
                }else if(current.getPaymentType().equals("check")){
                    ui.printToGeneralOut("Paid by check");
                    ui.printToGeneralOut("\n");
                }else if(current.getPaymentType().equals("credit")){
                    ui.printToGeneralOut("Paid by Credit Card number: "+current.getCardNum());
                    ui.printToGeneralOut("\n");
            }
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
