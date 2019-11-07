
package records.Payment;

/**
 * Subclass for check payment.
 *
 * @author Susanne
 */
public class CheckPayment extends Payment {

    public CheckPayment(double amount) {
        _type = "CHECK";
        _amountDue = amount;
    }

    @Override
    public String toString() {
        return _type + " " + Double.toString(_amountDue);
    }

    public void makePayment(double amountPaid) {
        _amountDue -= amountPaid;
    }
}
