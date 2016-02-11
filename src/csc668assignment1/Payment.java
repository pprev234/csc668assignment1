package csc668assignment1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Susanne
 */
public abstract class Payment {
    private double amountDue;
    
    public Payment(){
        
    }
    
    public Payment(double amountDue){
        this.amountDue = amountDue;
    }
    
    public abstract void makePayment(double amountPaid);
    public abstract double getAmountDue();
    
}
