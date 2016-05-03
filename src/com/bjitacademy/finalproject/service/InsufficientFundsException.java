package com.bjitacademy.finalproject.service;

import org.springframework.core.NestedRuntimeException;

import java.math.BigDecimal;

/**
 * @author janm
 */
public class InsufficientFundsException extends NestedRuntimeException {
    private BigDecimal required;
    public InsufficientFundsException(BigDecimal required) {
        super("Insufficient funds");
        this.required = required;
    }
    public BigDecimal getRequired() {
        return required;
    }
}
