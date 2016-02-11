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
    private String upc;
    
    public SalesLineItem(){
        
    }
    public SalesLineItem(String upc, int quantity){
        this.quantity = quantity;
        this.upc = upc;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    public String getUpc(){
        return this.upc;
    }
    public void setQuantity(int q){
        this.quantity=q;
    }
    public void setUpc(String upc){
        this.upc=upc;
    }
}
