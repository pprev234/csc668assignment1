/*
 * 
 */
package csc668assignment1.UserInterface;

import csc668assignment1.Resources.FileProductsResource;
import csc668assignment1.Resources.FileTransactionsResource;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author axelanconaesselmann
 */
public class ConsoleUserInterface extends UserInterface {
    /**
     * 
     * @param transactionsFileName
     * @param productsFileName 
     */
    public ConsoleUserInterface(String transactionsFileName, String productsFileName) {
        try {
            _transactions = new FileTransactionsResource(transactionsFileName);
            _products     = new FileProductsResource(productsFileName);
            
            System.out.print("Working");
        } catch (IOException ex) {
            System.out.print("Not working");
        }
        
    }
}
