/*
 * 
 */
package csc668assignment1.UserInterface;

import csc668assignment1.Resources.ConsoleMessageResource;
import csc668assignment1.Resources.FileProductsResource;
import csc668assignment1.Resources.FileTransactionsResource;
import csc668assignment1.Resources.ResourceException;
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
        _messages = new ConsoleMessageResource();
        try {
            _transactions = new FileTransactionsResource(transactionsFileName);
            _products     = new FileProductsResource(productsFileName);
        } catch (ResourceException ex) {
            this.printAlertMessage("Could not initialize resources:\n\n" + ex.getMessage());
        }
    }
}
