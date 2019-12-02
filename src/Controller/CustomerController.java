/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nmpellias
 */
public class CustomerController implements IDao<Customer>{

    @Override
    public List<Customer> getAll() {
        List<Customer> customers = new ArrayList();
        
        return customers;
    }

    @Override
    public Customer getById(String id) {
        Customer customer = null;
        
        return customer;
    }

    @Override
    public Customer save(Customer t) {
        Customer customer = null;
        
        return customer;
    }

    @Override
    public Customer delete(Customer t) {
        Customer customer = null;
        
        return customer;
    }

    @Override
    public Customer update(Customer t, String[] params) {
        Customer customer = null;
        
        return customer;
    }
    
}


