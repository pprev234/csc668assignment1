
package csc668assignment1;

/**
 *
 * @author Jie Li
 * Description: GUITransactionReader is responsible for reading transactions from Post GUI
 * Store and GUI will communicate through GUITransactionReader as two running threads.
 */
public class GUITransactionReader {
    private Transaction currentTransaction;//need to be reset
    //use flag to controll the concurrent accesses to GUITransactionReader from GUI and Store
    private boolean flag;

    //constructor
    public GUITransactionReader(){
        flag = false;
    }
    
    //called by PostGUI when "Enter" button is hit
    //@param String value of transactionItem. "upc" + " " + "quantity"
    public void setTransactionItem(String transactionItem){
        this.currentTransaction.addTransactionItem(transactionItem); 
    }
    //called by PostGUI when "Pay" button is hit
    //@param String value of payment. E.g "CHECK 2345"
    public synchronized void setPayment(String payment){
        this.currentTransaction.setPayment(payment);
        //free the store
        flag = true;
        notify();
    }
    
    //will be called by GUI to update the invoice panel
    public Transaction getCurrentTransaction(){
        return this.currentTransaction;
    }
    
    //will be called by GUI when the user hits "Start" button after entering name
    public synchronized void setCurrentTransaction(String customerName ){
       if(flag){
            try {
                wait();//wait for store to process the transaction
                //note: it can wait forever if store is closed after the last transaction
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //notified by Store, continue the next transaction
        //don't set flag now. Let Store wait for the next transaction
        this.currentTransaction = new Transaction(customerName);

    }
    //call by store to support the continuity of transactions
    public synchronized boolean hasMoreTransactions(){
        if (!flag) {
            try {
                wait();//wait for a complete Transaction from GUI
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //A complete Transaction is all set
        flag = false;//let GUI continue
        notify();
        return true;
    }
}
