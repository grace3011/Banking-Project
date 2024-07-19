package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Transactions;
import com.wecp.progressive.service.TransactionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

import javax.transaction.Transaction;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public ResponseEntity<List<Transactions>> getAllTransactions() throws SQLException {
        List<Transactions> list=transactionService.getAllTransactions();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    @GetMapping("/{transactionId}")
    public ResponseEntity<Transactions> getTransactionById(@PathVariable int transactionId) throws SQLException {
        return new ResponseEntity<>(transactionService.getTransactionById(transactionId),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Integer> addTransaction(@RequestBody Transactions transaction) throws SQLException {
        return new ResponseEntity<>(transactionService.addTransaction(transaction),HttpStatus.OK);
    }

    @PutMapping("/{transactionId}")
    public ResponseEntity<Void> updateTransaction(@PathVariable int transactionId,@RequestBody Transactions transaction) throws SQLException {
        transactionService.updateTransaction(transaction);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{transactionId}")
    public ResponseEntity<Void> deleteTransaction(@PathVariable int transactionId) throws SQLException {
         transactionService.deleteTransaction(transactionId);
         return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/customer{customerId}")
    public ResponseEntity<List<Transactions>>  getAllTransactionsByCustomerId(int customerId) throws SQLException{
        List<Transactions> li=transactionService.getTransactionsByCustomerId(customerId);
        return new ResponseEntity<>(li,HttpStatus.OK);
    }
}
