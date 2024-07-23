package com.wecp.progressive.exception;

<<<<<<< HEAD
public class WithdrawalLimitException {
=======
public class WithdrawalLimitException extends RuntimeException {
    public WithdrawalLimitException(String message) {
        super(message);
    }
>>>>>>> b59c1594ec22c506fd61e577027a81b044d1a42f
}