package com.rest.service;

import com.rest.dao.impl.CustomerDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerDaoImpl customerDao;




}
