/*
 * Only a stub for now
 */
package csc668assignment1.Payment;

/**
 *
 * @author axelanconaesselmann
 */
public class CreditPayment extends Payment {
    private String _cardNbr;
    public CreditPayment(String cardNbr) {
        _type    = "CREDIT";
        _cardNbr = cardNbr;
    }
    @Override
    public String toString() {
        return _type + " " + _cardNbr;
    }
}
