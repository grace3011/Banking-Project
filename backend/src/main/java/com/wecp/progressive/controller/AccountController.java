// package com.wecp.progressive.controller;

// import com.wecp.progressive.entity.Accounts;
// import com.wecp.progressive.service.AccountService;
// import com.wecp.progressive.service.AccountServiceImplJpa;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import java.sql.SQLException;
// import java.util.List;


// @RestController
// @RequestMapping("/accounts")
// public class AccountController {

//     @Autowired
//     private AccountServiceImplJpa accountService;

//     @GetMapping
//     public ResponseEntity<List<Accounts>> getAllAccounts() throws SQLException {
//         List<Accounts> li=accountService.getAllAccounts();
//         return new ResponseEntity<>(li,HttpStatus.OK);
//     }

//     @GetMapping("/{accountId}")
//     public ResponseEntity<Accounts> getAccountById(@PathVariable int accountId) throws SQLException {
//         return new ResponseEntity<>(accountService.getAccountById(accountId),HttpStatus.OK);
//     }

//     //@GetMapping("/user/{customerId")
//     //public ResponseEntity<List<Accounts>> getAccountsByUser(String param) throws SQLException {
//        // List<Accounts> li=accountService.getAccountsByUser();
//         //return new ResponseEntity<>(li,HttpStatus.OK);
//         //}

    
//     public ResponseEntity<Integer> addAccount(Accounts accounts) throws SQLException {
//         return new ResponseEntity<>(accountService.addAccount(accounts),HttpStatus.OK);
//     }

//     public ResponseEntity<Void> updateAccount(int accountId, Accounts accounts) throws SQLException {
//         accountService.updateAccount(accountId, accounts);
//         return new ResponseEntity<>(HttpStatus.OK);
//     }

//     public ResponseEntity<Void> deleteAccount(int accountId) throws SQLException {
//         accountService.deleteAccount(accountId);;
//         return new ResponseEntity<>(HttpStatus.OK);
//     }
// }