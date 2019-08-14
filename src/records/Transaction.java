
package records;


import records.Payment.Payment;
import records.Payment.CashPayment;
import records.Payment.CheckPayment;
import records.Payment.CreditPayment;

/**
 *
 * @author Jie Li
 * Description: One instance of Transaction stores one record of transaciton.
 * Assuming that each transaction record doesn't have customer and payment; it 
 * only consists of a list of TransactionItems. 
 * 
 */
public class Transaction {

    private TransactionItem[] transItems;
    private TransactionItem currentTransactionItem;
    private Customer customer;
    private int totalTransItems;
    private double totalPrice;
    private Payment payment;
    
    //This non-concrete constructor will be invoked by TransactionReader 
    public Transaction(String customerName){
        this.setCustomer(customerName);
        //initiate the transactionItems array
        this.transItems = new TransactionItem[100];
        this.totalTransItems = 0;
        this.totalPrice = 0.0;
        
    }
    //called by GUITransactionReader
    //@param transactionItem is of String value -> "1001" + " "+"1"
    public void addTransactionItem(String transactionItem){
        //System.out.println("Transaction.addTransactionItem: currentTransacitonItem: "+ transactionItem);
        this.setCurrentTransactionItem(transactionItem);
        this.transItems[this.totalTransItems++] = this.currentTransactionItem;
        //for testing
        //this.printCurrentTransactionItem();
        
    }
    public void setCurrentTransactionItem(String transactionItem){//"1001 1"
        String upc = transactionItem.substring(0, 4);
        int quantity = Integer.parseInt(transactionItem.substring(5));
        this.currentTransactionItem = new TransactionItem(upc, quantity);
    }
    public void setCustomer(String customerName){
        this.customer = new Customer(customerName);
    }
    public void setPayment(String payment){
        if(payment.contains("CREDIT")){//"CREDIT 1234"
            this.payment = new CreditPayment(payment.substring(7));
        }else if(payment.contains("CHECK")){//"CHECK 1000"
            this.payment = new CheckPayment(Double.parseDouble(payment.substring(6)));
        }else if(payment.contains("CASH")){//"CASH 1000"
            this.payment = new CashPayment(Double.parseDouble(payment.substring(5)));
        }
            
        
    }
    public double getTotalPrice(){
        this.totalPrice += this.currentTransactionItem.getSubtotal();
        this.totalPrice =Math.floor(this.totalPrice * 100) / 100;
        return this.totalPrice;
        
    }
    public TransactionItem getCurrentTransactionItem(){
        return this.currentTransactionItem;
    }
    
    public Customer getCustomer(){
        return this.customer;
    }
    public TransactionItem[] getTransItems(){
        return this.transItems;
    }
    public Payment getPayment(){
        return this.payment;
    }
    public int getTotalTransItems(){
        return this.totalTransItems;
    }
    public void printTransItems(){
        for(int i = 0; i < this.totalTransItems; i++){
            System.out.println(this.transItems[i].toString());
        }
    }
            
}
