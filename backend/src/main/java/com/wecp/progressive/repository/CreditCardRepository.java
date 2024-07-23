package com.wecp.progressive.repository;


<<<<<<< HEAD
public interface CreditCardRepository {
=======
import com.wecp.progressive.entity.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
>>>>>>> b59c1594ec22c506fd61e577027a81b044d1a42f
}