/*
 * Author: Paul Previde
 * Customer class stores information relating to the customers who enter 
 * into transactions at the Post.
 * For this project, the only material attribute of the Customer is the name.
 */
package records;


public class Customer {

    private String name;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
