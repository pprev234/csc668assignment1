/*
 * Author: Jie Li
 * Date: 2016/2/10
 * Purpose:1. To record information regrading to a transaction as a list of String. E.g date, customer, sale line itmes and payment.
 */
package csc668assignment1;

public class Transaction {
    private Customer customer;//may not needed
    private String[] transItems_string;
    //private Payment payment;
    private Payment_2 payment;
    private int totalTransItems;
    private int counter;
    private SalesLineItem[] transItems;
    
    public Transaction(String customerName, String[] transItems, int totalTransItems, String payment){
        this.customer = new Customer(customerName);//may not needed
        this.transItems_string = transItems;
        //this.payment = new Payment(payment);
        this.payment = new Payment_2(payment);
        this.totalTransItems = totalTransItems;
        this.counter = 0;
        this.transItems = new SalesLineItem[100];
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
    public SalesLineItem[] getTransItems(){
        return this.transItems;
    }
    /*@parameter transItem: "1001 2" 
     */
    public SalesLineItem getNextTransItem(String transItem){
        //split transItem
        //System.out.println("transItem:" + transItem);
        String upc = transItem.substring(0, 4);
        //System.out.println("transItem.substring(0, 4): " + upc);
        int quantity = 1;
        //System.out.println("transItem.substring(9): " + transItem.substring(9) );
        if(!transItem.substring(9).isEmpty()){//quantity is more than 1
            quantity = Integer.parseInt(transItem.substring(9));
        }
        return new SalesLineItem(upc, quantity);
        
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
