package com.wecp.progressive.exception;

<<<<<<< HEAD
public class OutOfBalanceException {
=======
public class OutOfBalanceException extends RuntimeException {
    public OutOfBalanceException(String message) {
        super(message);
    }
>>>>>>> b59c1594ec22c506fd61e577027a81b044d1a42f
}