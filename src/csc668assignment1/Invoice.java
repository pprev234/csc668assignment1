/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc668assignment1;
import java.sql.Timestamp;
import java.util.LinkedList;
/**
 * This represents an Invoice from the purchase of an item(s)
 * 
 * @author Karl
 */
public class Invoice {
    //private int InvoiceId;
    private String customerName;
    private Timestamp dateTime;
    /**
     * A linked list of SalesLineItem objects, each with a upc,quantity pair.
     */
    private LinkedList<SalesLineItem> salesLineItem;
    //private int quantity;
    private String paymentType;
    private double subtotal;
    private String cardNum;
    private double amountTendered;
    
    public Invoice(){
        
    }
    
/*      ACCESSORS             */
    public String getCustomerName(){
        return customerName;
    }
    public Timestamp getTimestamp(){
        return dateTime;
    }
    public LinkedList getProductList(){
        return this.salesLineItem;
    }
    /*public String getUpc(){
        return upc;
    }*/
    /*public int getQuantity(){
        return quantity;
    }*/
    public String getPaymentType(){
        return paymentType;
    }
    public double getSubtotal(){
        return subtotal;
    }
    public String getCardNum(){
        return cardNum;
    }
    public double getAmountTendered(){
        return amountTendered;
    }
    
/* MUTATORS                      */
    public void setCustomerName(String name){
        this.customerName = name;
    }
    /*public void setUpc(String upc){
        this.upc = upc;
    }*/
    public void setTimestamp(Timestamp ts){
        this.dateTime=ts;
    }
    /*public void setQuantity(int quantity){
        this.quantity=quantity;
    }*/
    public void setProductList(LinkedList<SalesLineItem> a){
        this.salesLineItem=a;
    }
    public void setPaymentType(String name){
        customerName = name;
    }
    public void setSubtotal(double subtotal){
        this.subtotal=subtotal;
    }
    public void setCardNum(String cardNum){
        this.cardNum = cardNum;
    }
    public void setAmountTendered(double amtTendered){
        this.amountTendered=amtTendered;
    }
}
