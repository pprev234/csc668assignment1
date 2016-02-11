/*
 * Author: Paul Previde
 * 
 */
package csc668assignment1;

/**
 *
 * @author pprevide
 */
public class Manager {
    
    private static int idNumber = 1;
    private final int managerId;
    
    public Manager () {
        managerId = idNumber;
        idNumber++;
    }
    
    public void openStore (Store store) {
        store.openStore();
    }
    
    public void closeStore (Store store) {
        store.closeStore();
    }
    
    public void initializePost(Store store) {
        store.initializePost();
    }
    
    public ProductCatalog initializeProductCatalog(String filename) {
        ProductCatalog p = null;
        try {
        p = ProductCatalog.getProductCatelog(filename);       
        } catch (Exception e) {
            ui.print("Product Catalog could not be initialized; exiting Post system");
            System.exit(1);
        }
        return p;
    }
    
    public void initializeSalesLog(Store store) {
        store.initializeSalesLog();
    }
    
    
    
}
