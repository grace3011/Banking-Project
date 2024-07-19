package com.wecp.progressive.service;

import java.util.List;

import javax.transaction.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Transactions;
import com.wecp.progressive.repository.TransactionRepository;



@Service
public class TransactionServiceImplJpa {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transactions> getAllTransactions(){
        return transactionRepository.findAll();
    }
    public Transactions getTransactionById(Integer transactionId){
        return transactionRepository.findById(transactionId).orElse(null);
    }
    public Transactions addTransaction(Transactions transactions){
        return transactionRepository.save(transactions);
    }
    public void updateTransaction(Integer transactionId,Transactions transactionDetails){
        Transactions tt=transactionRepository.findById(transactionId).orElse(null);
       if(tt!=null){
        transactionRepository.save(tt);
    } 
    }
        
    public void deleteTransaction(Integer id){
        transactionRepository.deleteById(id);
    }
    public Transactions getAllTransactionsByCustomerId(Integer customerId){
        return transactionRepository.getAllTransactionsByCustomerId(customerId);
    }
}
