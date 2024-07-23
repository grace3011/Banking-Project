<<<<<<< HEAD
package com.wecp.progressive.exception;

public class CustomerAlreadyExistsException {
=======

package com.wecp.progressive.exception;

public class CustomerAlreadyExistsException extends RuntimeException {
    public CustomerAlreadyExistsException(String message) {
        super(message);
    }
>>>>>>> b59c1594ec22c506fd61e577027a81b044d1a42f
}