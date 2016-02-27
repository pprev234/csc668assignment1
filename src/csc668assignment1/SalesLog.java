/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc668assignment1;
import java.util.LinkedList;



/**
 * allows the viewing of Invoices and recording of sales as invoices.
 * @author Karl
 */
public class SalesLog {
    private LinkedList<Invoice> invoiceList;
    SalesLog(){
        //initialize the invoiceList
        invoiceList = new LinkedList<Invoice>();
    };
    public void viewAllInvoices(){

    }
    public void viewInvoice(String name){
        
    }
    public void recordInvoice(Invoice t){
        invoiceList.add(t);
    }
    
    
    
}
