
package csc668assignment1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
  *
  * Author: Paul Previde
  * Store class: Provides services to keep track of the store and its various 
  * components.  Singleton design concepts are used, as there should be only one
  * Store instance. Store communicates with other classes, to which it delegates
  * various responsibilities.* @author pprevide
  */

public class Store {
      
    private static Store store = null; // store is a singleton
    private boolean isOpen;
    private Manager manager;
    private static final String NAME = "Apple Store";
    private static Post post;
    private ProductCatalog catalog;
    private SalesLog salesLog;

    // FILENAME holds the text file that contains products
    private final static String PRODUCTSFILE = "products.txt";
    private final static String TRANSACTIONSFILE = "Transactions.txt";

    // There is no public constructor and no default, no-arg constructor
    protected Store () { }

    // createStore() method is responsible for creating the single Store instance
    private static void createStore() {
        if (store==null) {
            store = new Store();
        }
    }

    public void openStore() {
        this.setIsOpen(true);
    }

    public void closeStore() {
        this.setIsOpen(false);
    }

    public void initializePost() {
        try {
        this.post = new Post();
        } catch (Exception e) {
            
            System.out.println("Transactions file not found, program will exit.");
            System.exit(1);
        }
    }

    public void initializeSalesLog() {
        this.salesLog = new SalesLog();
    }

    public static Store getStore() {
        return store;
    }

    public static void setStore(Store store) {
        Store.store = store;
    }

    public boolean storeIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public ProductCatalog getCatalog() {
        return catalog;
    }

    public void setCatalog(ProductCatalog catalog) {
        this.catalog = catalog;
    }

    public SalesLog getSalesLog() {
        return salesLog;
    }

    public void setSalesLog(SalesLog salesLog) {
        this.salesLog = salesLog;
    }

    public static String getStoreName(){
        return NAME;
    }


    public static void main (String[] args) throws FileNotFoundException, IOException {    
        createStore();
        // Manager causes a series of initialization steps to be conducted:
        // (1) open store (2) initialize the Post 
        // (3) initialize catalog (4) initialize sales log
        Manager manager = new Manager();
        manager.openStore(store);
        manager.initializePost(store);
        store.setCatalog(manager.initializeProductCatalog(PRODUCTSFILE));
        manager.initializeSalesLog(store);
        //TransactionReader t = new TransactionReader(TRANSACTIONSFILE);
        final GUITransactionReader t = new GUITransactionReader();
        //set up the GUI for Post
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PostGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PostGUI(t).setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(PostGUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(PostGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        while(t.hasMoreTransactions()){
            Transaction newTransaction = t.getCurrentTransaction();
            Store.post.processTransaction(newTransaction);
            Invoice invoice= Store.post.getInvoice();
            invoice.print();
            //add invoice to salescatalog 
            store.getSalesLog().recordInvoice(invoice);          
        }

        manager.closeStore(store);
    } // end main method

}