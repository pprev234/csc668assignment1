
package records;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Jie Li
 * Date: 2/11/2016
 * Purpose: build a transactionReader to read transaciton records from a file.
 */
public class TransactionReader {
    private BufferedReader in;
    private String line;
    private Transaction currentTransaction;
    private String customerName;
    private String transactionItem;
    private String payment;
    public TransactionReader(String transactionFile) throws FileNotFoundException{
        this.in = new BufferedReader(new FileReader(transactionFile));
    }
    public boolean hasMoreTransactions() throws IOException{
        this.line = this.in.readLine();//Always assume this is the line for Customer Name
        if(this.line != null){
            this.customerName = this.line;
            //System.out.println(this.customerName);
            this.currentTransaction = new Transaction(this.customerName);
            return true;
        }
        return false;
    }
    

    /*
     * e.g 
     * this.customerName = "Jie";
     * this.transItems_String = new String[2];
     * transItems_String[0] = "1001 2";
     * transItems_String[1] = "1002 1";
     * this.payment = "CASH 10000";
     */
    public Transaction getNextTransaction() throws IOException{
        //read the first line of item
        this.line = this.in.readLine();
        //System.out.println("nextTrans: " + this.line);
        while(!this.line.startsWith("C")){//reports error here
            this.transactionItem = this.line;
            //add transaction item to current Transaction
            this.currentTransaction.addTransactionItem(this.transactionItem);
            this.line = this.in.readLine();
            //System.out.println("nextTrans: " + this.line);
        }
        this.payment = this.line;//read the payment
        this.currentTransaction.setPayment(payment);//set payment
        this.in.readLine();//read an empty line
 
        return this.currentTransaction;
        
    }

    //public static void main(String[] args) throws FileNotFoundException, IOException{
        //TransactionReader tr = new TransactionReader("Transactions.txt");
        //ProductCatalog.getProductCatelog("products.txt").setProductCatelog();
        //while(tr.hasMoreTransactions()){
             //Transaction t = tr.getNextTransaction(); 
             //System.out.println("printing tranItems:");
             //t.printTransItems();
             //Invoice i = new Invoice(t);
             //i.print();
        //}
       

    //}
    
}
