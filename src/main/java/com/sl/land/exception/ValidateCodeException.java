package com.sl.land.exception;


import org.springframework.security.core.AuthenticationException;

/**
 * @author ShuLu
 */
public class ValidateCodeException extends AuthenticationException {
    private static final long serialVersionUID=100000000L;
    public ValidateCodeException(String explanation) {
        super(explanation);
    }
}
