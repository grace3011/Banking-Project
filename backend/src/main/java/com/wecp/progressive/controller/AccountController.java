package com.wecp.progressive.controller;
<<<<<<< HEAD

import com.wecp.progressive.entity.Accounts;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



public class AccountController {


    public ResponseEntity<List<Accounts>> getAllAccounts() {
        return null;
    }

    public ResponseEntity<Accounts> getAccountById(int accountId) {
        return null;
    }

    public ResponseEntity<List<Accounts>> getAccountsByUser(String param) {
        return null;
    }

    public ResponseEntity<Integer> addAccount(Accounts accounts) {
        return null;
    }

    public ResponseEntity<Void> updateAccount(int accountId, Accounts accounts) {
        return null;
    }

    public ResponseEntity<Void> deleteAccount(int accountId) {
        return null;
=======
 
 
import com.wecp.progressive.entity.Accounts;
import com.wecp.progressive.service.AccountService;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
 
import java.sql.SQLException;
import java.util.List;
 
 
@RestController
@RequestMapping("/accounts")
public class AccountController {
 
    private final AccountService accountService;
 
    @Autowired
    public AccountController(@Qualifier("accountServiceImplJpa") AccountService accountService) {
        this.accountService = accountService;
    }
 
    @GetMapping
    public ResponseEntity<List<Accounts>> getAllAccounts() {
        try {
            List<Accounts> accounts = accountService.getAllAccounts();
            return new ResponseEntity<>(accounts, HttpStatus.OK);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
 
    @GetMapping("/{accountId}")
    public ResponseEntity<Accounts> getAccountById(@PathVariable int accountId) {
        try {
            Accounts accounts = accountService.getAccountById(accountId);
            if (accounts != null) {
                return new ResponseEntity<>(accounts, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Accounts>> getAccountsByUser(@PathVariable String userId) {
        try {
            List<Accounts> accounts = accountService.getAccountsByUser(Integer.parseInt(userId));
            return new ResponseEntity<>(accounts, HttpStatus.OK);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
 
    @PostMapping
    public ResponseEntity<Integer> addAccount(@RequestBody Accounts accounts) {
        try {
            int accountId = accountService.addAccount(accounts);
            return new ResponseEntity<>(accountId, HttpStatus.CREATED);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
 
    @PutMapping("/{accountId}")
    public ResponseEntity<Void> updateAccount(@PathVariable int accountId, @RequestBody Accounts accounts) {
        try {
            accounts.setAccountId(accountId);
            accountService.updateAccount(accounts);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
 
    @DeleteMapping("/{accountId}")
    public ResponseEntity<Void> deleteAccount(@PathVariable int accountId) {
        try {
            accountService.deleteAccount(accountId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
>>>>>>> b59c1594ec22c506fd61e577027a81b044d1a42f
    }
}