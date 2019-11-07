/**
 * Enables the viewing of Invoices and recording of sales as invoices.
 *
 * This class provides convenience methods for handling a list of invoices.
 *
 * @author Karl
 */

package records;

import java.util.LinkedList;


public class SalesLog {
    private LinkedList<Invoice> invoiceList;

    SalesLog() {
        invoiceList = new LinkedList<Invoice>();
    }

    public void recordInvoice(Invoice t) {
        invoiceList.add(t);
    }

}
