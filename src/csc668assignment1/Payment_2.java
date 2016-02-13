/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csc668assignment1;

/**
 *
 * @author lenovo
 */
public class Payment_2 {
    private String paymentType = "CASH";
    private double tenderedAmount = 1000.0;
    private String cardNumber = "12345";
    public Payment_2(String payment){
        //parse thhe payment
    }
    public String getPaymentType(){
        return this.paymentType;
    }
    public double getTenderedAmount(){
        return this.tenderedAmount;
    }
    public String getCardNumber(){
        return this.cardNumber;
    }
    
    
}
