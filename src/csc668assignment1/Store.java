package csc668assignment1;

import csc668assignment1.UserInterface.ConsoleUserInterface;

/**
 *
 * @author pprevide
 */
public class Store {
    
    public static void main (String[] args) {
        ConsoleUserInterface cui = new ConsoleUserInterface("transactions.txt", "products.txt");
        
        
        ProductSpec p;
        while ((p = cui.readNextProduct()) != null) cui.printProduct(p);

        
        Transaction t;
        while ((t = cui.readNextTransaction()) != null) cui.printTransaction(t);
         
    } 
}