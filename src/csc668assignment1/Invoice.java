/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc668assignment1;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.text.DecimalFormat;
import csc668assignment1.UserInterface.*;
/**
 * This represents an Invoice from the purchase of an item(s)
 * 
 * @author Karl
 */
public class Invoice {
    private static int invoiceId = 0;
    private String storeName;
    private String customerName;
    private Timestamp dateTime;
    /**
     * A linked list of SalesLineItem objects, each with a upc,quantity pair.
     */
    private SalesLineItem[] salesLineItem;
    private int totalTransItem;
    private String paymentType;
    private double TenderedAmount;
    private double ReturedAmount;
    private String cardNum;
    private double total;
    private UserInterface ui = new UserInterface();
    
    public Invoice(Transaction t){
        //set the Timestamp
        invoiceId++;
        this.storeName = Store.getStoreName();
        this.customerName = t.getCustomer().getName();
        this.salesLineItem = t.getTransItems();
        this.totalTransItem = t.getTotalTransItems();
        this.paymentType = t.getPayment().getPaymentType();
        this.TenderedAmount = t.getPayment().getTenderedAmount();
        this.cardNum = t.getPayment().getCardNumber();//null if paid by cash or check   
        this.total = 0.0;//initialize the total price
        calculate();
    }
    public void calculate(){
        //Accumulate subtotal from each SalesLineItem to get total
        for(int i = 0; i < this.totalTransItem; i++){
            this.total += this.salesLineItem[i].getSubtotal();
        }
        //get the amount for return
        this.ReturedAmount = this.TenderedAmount - this.total;
        
    }
    /*
     * invoice needs to be printed in the following format
     * STORE NAME
     * Customer Name Date Time
     * Item: description quantity @ unitPrice subtotal
     * ----------
     * Total $xxxx.xx
     * Amount Tendered: xxxx.xx OR Paid by check OR Creadit Card ddddd
     * Amount Returned: xxxx.xx
     */
    public void print(){
        //need to be implemented
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        
        ui.println(this.storeName);
        for(int i = 0; i < this.totalTransItem; i++){
            String s = "";
            s += this.salesLineItem[i].getProductSpec().getDescription() + "\t";
            s += this.salesLineItem[i].getQuantity();
            s += " @ ";
            s += this.salesLineItem[i].getProductSpec().getUnitPrice() + "\t";
            s += this.salesLineItem[i].getSubtotal();
            System.out.println(s); 
        }
        ui.println("-----------------------------------------");
        ui.println("Total $" + Math.floor(this.total * 100) / 100);
        ui.println("Amount Tendered: " + numberFormat.format(this.TenderedAmount));
        ui.println("Amount Returned: " + numberFormat.format(this.ReturedAmount));
        ui.println("");
       
    }
/*      ACCESSORS             */
    public static int getInvoiceId(){
        return invoiceId;
    }
    public String getCustomerName(){
        return customerName;
    }
    public Timestamp getTimestamp(){
        return dateTime;
    }
    public SalesLineItem[] getProductList(){
        return this.salesLineItem;
    }

    public String getPaymentType(){
        return paymentType;
    }
    public double getTotal(){
        return this.total;
    }
    public String getCardNum(){
        return cardNum;
    }
    public double getAmountTendered(){
        return this.TenderedAmount;
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
    public void setProductList(SalesLineItem[] a){
        this.salesLineItem=a;
    }
    public void setPaymentType(String name){
        customerName = name;
    }
    public void setCardNum(String cardNum){
        this.cardNum = cardNum;
    }
    public void setAmountTendered(double amtTendered){
        this.TenderedAmount=amtTendered;
    }
}
