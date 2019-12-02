/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author nmpellias
 */
public class Order {
    private String id;
    private String dateOfCreation;
    private Customer customer;
    private List<Product> productItems;

    public Order() {
    }

    public Order(String id, String dateOfCreation, Customer customer, List<Product> productItems) {
        this.id = id;
        this.dateOfCreation = dateOfCreation;
        this.customer = customer;
        this.productItems = productItems;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProductItems() {
        return productItems;
    }

    public void setProductItems(List<Product> productItems) {
        this.productItems = productItems;
    }

    @Override
    public String toString() {
        String str1 = "Order{" + "id=" + id + ", dateOfCreation=" + dateOfCreation + ", customer=" + customer + "}";
        String str2 = "";
        float total = 0.0f;
        if(!this.productItems.isEmpty()){
            for(Product prod: this.productItems){
                str2 += prod.toString() + "\n";
                total += prod.getPrice();
            }
        }
        return str1 + "\n" + str2 + "\n" + "Total: " + total;
    }
    
    
}



