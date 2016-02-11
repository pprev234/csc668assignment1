/*
 * Classes implementing the UserInterface are responsible for reading and outputting 
 * Transactions, Products and Invoices
 */
package csc668assignment1.UserInterface;

import csc668assignment1.Invoice;
import csc668assignment1.Payments.Payment;
import csc668assignment1.Product;
import csc668assignment1.Resources.ProductsResourceInterface;
import csc668assignment1.Resources.TransactionsResource;
import csc668assignment1.Resources.AlertMessageResourceInterface;
import csc668assignment1.Transaction;

/**
 *
 * @author axelanconaesselmann
 */
public class UserInterface {
    protected TransactionsResource      _transactions;
    protected ProductsResourceInterface _products;
    protected AlertMessageResourceInterface _alert;
    

    /**
     * Reads the next product and returns a Product instance
     * @return Product
     */
    public Product readNextProduct() {
        if (!_products.hasNext()) return null;
        else {
            String upc         = _products.getUPC();
            String description = _products.getDescription();
            float  price       = _products.getPrice();
            return new Product(upc, description, price);
        }
    }
    
    /**
     * Reads the next transaction and returns a Transaction instance
     * @return 
     */
    public Transaction readNextTransaction() {
        if (_transactions.hasNext()) {
            String name     = _transactions.getName();
            String upc      = _transactions.getUPC();
            int    quantity = _transactions.getQuantity();
            Payment payment = _transactions.getPayment();
            return new Transaction(name, upc, quantity, payment);
        } else return null;
    }
    
    public void printAlert(String message) {
        _alert.print(message);
    }
    
    /**
     * Prints a Product instance
     * @param product 
     */
    public void printProduct(Product product) {
        _products.printProduct(product);
    }
    
    /**
     * Prints a Transaction Instance
     * @param transaction 
     */
    public void printTransaction(Transaction transaction) {
        _transactions.printTransaction(transaction);
    }
    
    /**
     * Prints an Invoice instance
     * @param invoice 
     */
    public void printInvoice(Invoice invoice) {
        
    }
}