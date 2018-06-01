package com.rest.dao.impl;

import com.rest.dao.contr.CustomerDao;
import com.rest.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    private List<Customer> customers = Arrays.asList(
            new Customer("X", 20, "x@a.com"),
            new Customer("Y", 21, "y@b.com"),
            new Customer("Z", 22, "z@c.com")
    );

    public List<Customer> getAllCustomers(){
        return customers;
    }

}
