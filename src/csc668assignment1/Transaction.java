/*
 * Author: Jie Li
 * Date: 2016/2/10
 * Purpose:1. To record information regrading to a transaction as a list of String. E.g date, customer, sale line itmes and payment.
 */
package csc668assignment1;

/**
 * Each Transaction would have a transaction record in transactionfile.txt
 * taking the transactoin record in the following format:
 *  String,
 *  TransactionItem[],
 *  
 * Prescription: TransactoinReader has a method called getNextTransaction to return in instance of Transaction
 * Assuming getNextTransaction() will initiate the instance of Transaction with Strings.
 * TransactionReader has the responsibility to split each transaction record
 *  
 */
public class Transaction {
    private Customer customer;//may not needed
    private String[] transItems_string;
    //private Payment payment;
    private Payment_2 payment;
    private int totalTransItems;
    private int counter;
    private TransactionItem[] transItems;
    
    public Transaction(String customerName, String[] transItems, int totalTransItems, String payment){
        this.customer = new Customer(customerName);//may not needed
        this.transItems_string = transItems;
        //this.payment = new Payment(payment);
        this.payment = new Payment_2(payment);
        this.totalTransItems = totalTransItems;
        this.counter = 0;
        this.transItems = new TransactionItem[100];
        setTransItems();
    }
    //create an instance of TransItems by providing its String description
    public void setTransItems(){
        while(hasMoreTransItems()){
            //add item to array
            this.transItems[this.counter] = getNextTransItem(this.transItems_string[this.counter]);
            //System.out.println("this.transItems[this.counter]: "+this.transItems[this.counter]);
            counter++;
        }
    }
    public TransactionItem[] getTransItems(){
        return this.transItems;
    }
    /*@parameter transItem: "1001 2" 
     */
    public TransactionItem getNextTransItem(String transItem){
        //split transItem
        //System.out.println("transItem:" + transItem);
        String upc = transItem.substring(0, 4);
        //System.out.println("transItem.substring(0, 4): " + upc);
        int quantity = 1;
        //System.out.println("transItem.substring(9): " + transItem.substring(9) );
        if(!transItem.substring(9).isEmpty()){//quantity is more than 1
            quantity = Integer.parseInt(transItem.substring(9));
        }
        return new TransactionItem(upc, quantity);
        
    }
    public boolean hasMoreTransItems(){
        return this.counter < this.totalTransItems;
    }
    public void printTransItems(){
        for(int i = 0; i < this.totalTransItems; i++){
            System.out.println(this.transItems[i]);
        }
    }
    
}
