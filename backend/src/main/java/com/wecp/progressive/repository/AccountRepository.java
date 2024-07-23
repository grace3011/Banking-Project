package com.wecp.progressive.repository;


<<<<<<< HEAD
public interface AccountRepository {
=======
import com.wecp.progressive.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Integer> {

    List<Accounts> getAccountsByCustomerCustomerId(int customerId);
    Accounts findByAccountId(int accountId);
>>>>>>> b59c1594ec22c506fd61e577027a81b044d1a42f
}
