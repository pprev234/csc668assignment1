/*
 * Only a stub for now
 */
package csc668assignment1.Payments;

/**
 *
 * @author axelanconaesselmann
 */
public class CashPayment extends Payment {
    public CashPayment(float ammount) {
        _type = "CASH";
        setAmmount(ammount);
    }
    @Override
    public String toString() {
        return _type + " " + this.getAmmount();
    }
}
