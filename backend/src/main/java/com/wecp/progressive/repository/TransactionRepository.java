package com.wecp.progressive.repository;

import javax.transaction.Transaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Transactions;

@Repository
public interface TransactionRepository extends JpaRepository<Transactions,Integer>{

    @Query("select t from Transcations t where t.customers.customerId = :customerId")
    public Transactions getAllTransactionsByCustomerId(Integer customerId);

   // public Transactions save(Transactions transactions);
}
