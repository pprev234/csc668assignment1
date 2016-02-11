/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc668assignment1;

/**
 * Item-quantity pairs in a transaction 
 * @author Karl
 */
public class SalesLineItem {
    private int quantity;
    private ProductSpec productSpec;
    private String upc;
    private ProductCatalog  pc = ProductCatalog.getInstance();
    public SalesLineItem(){
        
    }
    public SalesLineItem(String upc, int quantity ){
        this.quantity = quantity;
        this.upc = upc;
        this.productSpec = setProductSpec(upc);
    }
    /*ACCESSORS*/
    public int getQuantity(){
        return this.quantity;
    }
    public String getUpc(){
        return this.upc;
    }
    public ProductSpec getProductSpec(){
        if(productSpec!=null){
            return productSpec;
        }
        else
            return null;
    }
    public double getSubtotal(){
        return (this.quantity * this.productSpec.getUnitPrice());
    }
    /*MUTATORS*/
    public void setQuantity(int q){
        this.quantity=q;
    }
    public void setUpc(String upc){
        this.upc=upc;
    }
    /**
     * uses the upc of the product to retrieve the description from the Catalog
     * @param upc 
     */
    public void setProductSpec(String upc){
        this.productSpec = this.pc.getProductSpec(upc);
    }
    
}
