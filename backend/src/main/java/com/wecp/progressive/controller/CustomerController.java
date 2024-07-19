package com.wecp.progressive.controller;


import com.wecp.progressive.entity.Customers;
import com.wecp.progressive.entity.Transactions;
import com.wecp.progressive.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public ResponseEntity<List<Customers>> getAllCustomers() throws SQLException {
        return new ResponseEntity<>(customerService.getAllCustomers(),HttpStatus.OK);
    }

    public ResponseEntity<Customers> getCustomerById(int customerId) throws SQLException {
        return new ResponseEntity<>(customerService.getCustomerById(customerId),HttpStatus.OK);
    }

    public ResponseEntity<Integer> addCustomer(Customers customers) throws SQLException {
        return new ResponseEntity<>(customerService.addCustomer(customers),HttpStatus.OK);
    }

    public ResponseEntity<Void> updateCustomer(int customerId, Customers customers) throws SQLException {
        customerService.updateCustomer(customers);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    public ResponseEntity<Void> deleteCustomer(int customerId) throws SQLException {
        customerService.deleteCustomer(customerId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<List<Transactions>> getAllTransactionsByCustomerId(int cutomerId) {
        
        return null ;
    }
}
