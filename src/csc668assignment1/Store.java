
package csc668assignment1;
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
    private Post post;
    private ProductCatalog catalog;
    private SalesLog salesLog;

    // FILENAME holds the text file that contains products
    private final static String FILENAME = "products.txt";

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
        this.post = new Post();
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



    public static void main (String[] args) {    
        createStore();
        // Manager causes a series of initialization steps to be conducted:
        // (1) open store (2) initialize the Post 
        // (3) initialize catalog (4) initialize sales log
        Manager manager = new Manager();
        manager.openStore(store);
        manager.initializePost(store);
        store.setCatalog(manager.initializeProductCatalog(FILENAME));
        manager.initializeSalesLog(store);
        // Post instance is requested to carry out the transactions
        post.execute();
           
        // After customers have been served, Manager closes the store
        manager.closeStore(store);
    } // end main method

}