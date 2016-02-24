/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csc668assignment1;

/**
 *
 * @author Jie Li
 * Description: GUITransactionReader is responsible for reading transactions from Post GUI
 */
public class GUITransactionReader {
    private Transaction currentTransaction;//need to be reset

    //contructor
    public GUITransactionReader(){
        
    }
    
    //called by PostGUI when "Enter" button is hit
    //@param String value of transactionItem. "upc" + " " + "quantity"
    public void setTransactionItem(String transactionItem){
        this.currentTransaction.addTransactionItem(transactionItem); 
    }
    //called by PostGUI when "Pay" button is hit
    //@param String value of payment. E.g "CHECK 2345"
    public void setPayment(String payment){
        this.currentTransaction.setPayment(payment);
    }
    
    //will be called by GUI to update the invoice panel
    public Transaction getCurrentTransaction(){
        return this.currentTransaction;
    }
    
    //will be called by GUI when the user hits "Start" button after entering name
    public boolean setCurrentTransaction(String customerName ){
        //create a new instance of Transaction
        this.currentTransaction = new Transaction(customerName);
        return true;
    }
 
}
