/*
 * Author: Jie Li
 * Date: 2016/2/10
 * Description: This is a new Post that contain nothing about Input and Output. 
 * Post will be responsible for dealing with each Transaction received from Store
 * and make invoice returned to Store.
 * 
 */
package records;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Post {
    private Transaction currentTransaction;
    private Invoice currentInvoice;
    public Post(){    
    }
    public void processTransaction(Transaction newTransaction){
        this.currentTransaction = newTransaction;
        this.setInvoice();
    }
  
    public void setInvoice(){
        this.currentInvoice = new Invoice(this.currentTransaction);
    }
    public Invoice getInvoice(){
        return this.currentInvoice;
    }
    
    
}
