
package records.Payment;

/**
 * Parent abstract class for subclasses corresponding to payment methods.
 *
 * Each child class that extends this class will implement the makePayment() method.
 *
 * @author axelanconaesselmann, Susanne
 */
public abstract class Payment {
    protected double _amountDue;
    protected String _type;

    public Payment() {
        _amountDue = 0.0;
        _type = "";
    }

    public Payment(double amount) {
        _amountDue = amount;
    }

    public abstract void makePayment(double amountPaid);

    public String getType() {
        return _type;
    }

    public double getAmountDue() {
        return _amountDue;
    }
}
