/*
 * Only a stub for now
 */
package csc668assignment1.Payment;

/**
 *
 * @author Susanne
 */
public class CashPayment extends Payment {
    private float _change;
    
    public CashPayment(float ammount) {
        _type   = "CASH";
        _change = 0;
        setAmmount(ammount);
    }
    @Override
    public String toString() {
        return _type + " " + this.getAmmount();
    }

    public void makePayment(double amountPaid){
        _ammount -= amountPaid;
        // with cash there is always the issue of change? Or being short changed?
        
        _change = -_ammount;
    }

    
    //Might need this method?
    public double getChange() {
        return _change;
    }
}
