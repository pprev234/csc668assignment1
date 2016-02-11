/*
 * Just a stub with getters and setters.
 */
package csc668assignment1;

/**
 *
 * @author 
 */
public class Product {
    private String _upc, _description;
    private float _price;
    public Product (String upc, String description, float price) {
        _upc = upc;
        _description = description;
        _price = price;
    }
    public String getUPC() {
        return _upc;
    }
    public float getPrice() {
        return _price;
    }
    public String getDescription() {
        return _description;
    }
}
