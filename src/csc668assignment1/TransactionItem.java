/*
 * Author: Jie Li
 * Date: 2016/2/11
 * Description: TransactionItem stores each item in one transaction reacord, from transactionfile.txt.
 */
package csc668assignment1;

/**
 * Each TransactionItem will be formed with upc and quantity.
 */
public class TransactionItem {
    private String upc;
    private int quantity;
    
    public TransactionItem(String upc, int quantity){
        this.upc = upc;
        this.quantity = quantity;
    
    }
    @Override
    public String toString(){
        return "upc: " + upc + " quantity: " + quantity;
        
    }
    
}
