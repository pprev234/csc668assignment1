/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc668assignment1;

/**
 * 
 *
 * @author Susanne
 */
public class CashPayment extends Payment{
    private double amountDue;
    private double change;
    
    public CashPayment() {
        change = 0.0;
    }
    
    public CashPayment(double amountDue){
        this.amountDue = amountDue;
    }
    
    public void makePayment(double amountPaid){
        this.amountDue = this.amountDue - amountPaid;
        // with cash there is always the issue of change? Or being short changed?
        
        if (this.amountDue < 0 ) {
            getChange(this.amountDue);
        }
    }
    public double getAmountDue(){
        return amountDue;
    }
    
    //Might need this method?
    public double getChange(double change){
        this.change = (-1) * change;
        return this.change;
    }
}
