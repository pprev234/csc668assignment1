
package records;

import records.Payment.Payment;
import records.Payment.CashPayment;
import records.Payment.CheckPayment;
import records.Payment.CreditPayment;

import java.sql.Timestamp;

import java.util.LinkedList;
import java.text.DecimalFormat;

/**
 * This represents an Invoice from the purchase of an item(s)
 *
 * @author Jie
 */
public class Invoice {
    private static int invoiceId = 0;
    private String storeName;
    private String customerName;
    private Timestamp dateTime;
    private TransactionItem[] salesLineItem;
    private int totalTransItem;
    //variables for Payment
    private String paymentType;
    private double TenderedAmount;
    private double ReturedAmount;
    private int cardNum;
    private double total;
    private Payment payment;

    public Invoice(Transaction t) {
        //set the Timestamp
        invoiceId++;
        this.storeName = Store.getStoreName();
        this.customerName = t.getCustomer().getName();
        this.salesLineItem = t.getTransItems();
        this.totalTransItem = t.getTotalTransItems();
        this.total = 0.0;//initialize the total price
        setPayment(t.getPayment());
        calculateTotal();
    }

    public void calculateTotal() {
        //Accumulate subtotal from each TransactionItem to get total
        for (int i = 0; i < this.totalTransItem; i++) {
            this.total += this.salesLineItem[i].getSubtotal();
        }
        this.total = Math.floor(this.total * 100) / 100;
        //get the amount for return
        this.ReturedAmount = this.TenderedAmount - this.total;

    }

    /*
     * Populates the fields associated with the payment type
     * @param  payment an instance of one of the subclass of Payment
     */
    public void setPayment(Payment payment) {

        if (payment instanceof CheckPayment) {
            CheckPayment check = (CheckPayment) payment;
            this.payment = check;
            this.paymentType = check.getType();
            this.TenderedAmount = check.getAmountDue();
        } else if (payment instanceof CreditPayment) {
            CreditPayment credit = (CreditPayment) payment;
            this.payment = credit;
            this.paymentType = credit.getType();
            this.cardNum = credit.getCardNum();
        } else {
            CashPayment cash = (CashPayment) payment;
            this.payment = cash;
            this.paymentType = cash.getType();
            this.TenderedAmount = cash.getAmountDue();
        }
    }

    public Payment getPayment() {
        return this.payment;
    }

    public void print() {
        System.out.println(this.customerName);
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        System.out.println(this.storeName);
        for (int i = 0; i < this.totalTransItem; i++) {
            String s = "";
            s += this.salesLineItem[i].getProductSpec().getDescription() + "\t";
            s += this.salesLineItem[i].getQuantity();
            s += " @ ";
            s += this.salesLineItem[i].getProductSpec().getUnitPrice() + "\t";
            s += this.salesLineItem[i].getSubtotal();
            System.out.println(s);
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total $" + Math.floor(this.total * 100) / 100);
        if (this.paymentType.equals("CHECK")) {
            System.out.println("Paid by check");
        } else if (this.paymentType.equals("CREDIT")) {
            System.out.println("Paid by Credit Card " + this.cardNum);
        } else {//cash
            System.out.println("Amount Tendered: " + numberFormat.format(this.TenderedAmount));
            System.out.println("Amount Returned: " + numberFormat.format(this.ReturedAmount));
        }

        System.out.println("");


    }

    public static int getInvoiceId() {
        return invoiceId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Timestamp getTimestamp() {
        return dateTime;
    }

    public TransactionItem[] getProductList() {
        return this.salesLineItem;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public double getTotal() {
        return this.total;
    }

    public int getCardNum() {
        return cardNum;
    }

    public double getAmountTendered() {
        return this.TenderedAmount;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setTimestamp(Timestamp ts) {
        this.dateTime = ts;
    }

    public void setProductList(TransactionItem[] a) {
        this.salesLineItem = a;
    }

    public void setPaymentType(String name) {
        customerName = name;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public void setAmountTendered(double amtTendered) {
        this.TenderedAmount = amtTendered;
    }
}
