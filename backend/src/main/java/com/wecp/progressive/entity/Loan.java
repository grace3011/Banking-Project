package com.wecp.progressive.entity;

<<<<<<< HEAD
public class Loan {

=======

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
>>>>>>> b59c1594ec22c506fd61e577027a81b044d1a42f
    private Long id;
    private String loanType;
    private double amount;

<<<<<<< HEAD
=======
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
>>>>>>> b59c1594ec22c506fd61e577027a81b044d1a42f
}