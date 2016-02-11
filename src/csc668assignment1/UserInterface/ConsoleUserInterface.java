/*
 * 
 */
package csc668assignment1.UserInterface;

import csc668assignment1.Resources.FileProductsResource;
import csc668assignment1.Resources.FileTransactionsResource;
import java.io.IOException;

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
        } catch (IOException ex) {
            this.printAlert("Could not initialize resources");
        }
    }
}