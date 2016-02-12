/*
 * Author: Jie Li
 * Date: 2016/2/10
 * Purpose:1. To deal with transactions, print invoices and store invoices to sale log. 
 */
package csc668assignment1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Post {
    private TransactionReader transactionReader;
    //private TransactionItem[] currentTransItems;
    private Transaction currentTrans;
    private Invoice currentInvoice;
    public Post(String transactionFile) throws FileNotFoundException{
        this.transactionReader = new TransactionReader(transactionFile);     
    }
    public void execute() throws IOException{
        while(transactionReader.hasMoreTransactions()){
            this.currentTrans = transactionReader.getNextTransaction();
            //this.currentTransItems = this.currentTrans.getTransItems();
            System.out.println("printing transactoin items");
            this.currentTrans.printTransItems();
            System.out.println("");
            this.currentInvoice = new Invoice(this.currentTrans);
            setInvoice();
            currentInvoice.print();
        }
    }
    public void setInvoice(){
        this.currentInvoice = new Invoice(currentTrans);
    }
    //for testing 
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Post p = new Post("Transactions.txt");
        p.execute();
        
        
    }
    
    
}
