package com.wecp.progressive.repository;


<<<<<<< HEAD

public interface LoanRepository {
=======
import com.wecp.progressive.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
>>>>>>> b59c1594ec22c506fd61e577027a81b044d1a42f
}