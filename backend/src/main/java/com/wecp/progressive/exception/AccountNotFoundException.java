package com.wecp.progressive.exception;

<<<<<<< HEAD
public class AccountNotFoundException {
=======
public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(String message) {
        super(message);
    }
>>>>>>> b59c1594ec22c506fd61e577027a81b044d1a42f
}