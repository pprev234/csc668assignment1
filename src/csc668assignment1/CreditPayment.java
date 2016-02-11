/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc668assignment1;

/**
 * I did not make a CheckPayment.java since I think it would just be very similar
 * to CreditPayment.java, but without the cardNum variable.
 * 
 * @author Susanne
 */
public class CreditPayment extends Payment{
    private double amountDue;
    private int cardNum;
    
    public CreditPayment(){
        
    }
    
    public CreditPayment(double amountDue, int cardNum){
        this.amountDue = amountDue;
        this.cardNum = cardNum;
    }
    
    public void makePayment(double amountPaid){
        this.amountDue = this.amountDue - amountPaid;
        //do we need to consider creditline limits?
    }
    
    public double getAmountDue(){
        return this.amountDue;
    }
    
    public int getCardNum(){
        return this.cardNum;
    }
}
