/*
 * Author: Paul Previde
 *
 * Manager class: Offers services for opening and closing a store,  and initializing (by appropriate
 * requests to other classes) the product catalog, sales log, and Post.
 * The Manager's responsibilities include the above services, so these services are implemented as behaviors of the
 * Manager rather than of the Store.
 *
 */
package records;


public class Manager {

    private static int idNumber = 1;
    private final int managerId;

    public Manager() {
        managerId = idNumber;
        idNumber++;
    }

    public void openStore(Store store) {
        store.openStore();
    }

    public void closeStore(Store store) {
        store.closeStore();
    }

    public void initializePost(Store store) {
        store.initializePost();
    }

    public ProductCatalog initializeProductCatalog(String filename) {
        ProductCatalog p = null;
        try {
            p = ProductCatalog.getProductCatelog(filename);
            p.setProductCatalog();
        } catch (Exception e) {
            System.out.println("Product Catalog could not be initialized; exiting Post system");
            System.exit(1);
        }
        return p;
    }

    public void initializeSalesLog(Store store) {
        store.initializeSalesLog();
    }


}
