/*
 * Author: Paul Previde
 * Customer class stores information relating to the customers who enter 
 * into transactions at the Post.
 */
package records;


public class Customer {
    
    private String name;
    
    public Customer () { }
    
    public Customer (String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
