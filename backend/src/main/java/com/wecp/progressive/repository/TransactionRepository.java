package com.wecp.progressive.repository;

<<<<<<< HEAD
public interface TransactionRepository  {
=======
import com.wecp.progressive.entity.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transactions, Integer> {

    List<Transactions> findByAccountsAccountId(int accountId);
>>>>>>> b59c1594ec22c506fd61e577027a81b044d1a42f
}
