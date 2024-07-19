// package com.wecp.progressive.service;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.wecp.progressive.entity.Customers;
// import com.wecp.progressive.exception.CustomerAlreadyExistsException;
// import com.wecp.progressive.repository.CustomerRepository;

// @Service

// public class CustomerServiceImplJpa implements CustomerService{
//     @Autowired
//     private CustomerRepository customerRepository;

//     @Override
//     public List<Customers> getA
//     public List<Customers> getAllCustomers(){
//         return customerRepository.findAll();
//     }
//     public Customers getCustomerById(int customerId){
//         Customers cc= customerRepository.findById(customerId).orElse(null);
//         if(cc==null){
//             throw new CustomerAlreadyExistsException("Customer Already Exists!");

//         }
//         return cc;
//     }
//     public Integer addCustomer(Customers customers){
//         customerRepository.save(customers);
//         return customers.getCustomerId();
//     }
//     public void updateCustomer(int customerId, Customers customers){
//         Customers cc=customerRepository.findById(customerId).orElse(null);
//         customerRepository.save(customers);
//     }
//     public void deleteCustomer(Integer customerId){
//         customerRepository.deleteById(customerId);
//     }
// }