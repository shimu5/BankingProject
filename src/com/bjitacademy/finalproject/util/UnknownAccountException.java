package com.bjitacademy.finalproject.util;

import org.springframework.core.NestedRuntimeException;


public class UnknownAccountException extends NestedRuntimeException {
    private static final long serialVersionUID = -5705813683661824922L;
    Integer  identity;
    public UnknownAccountException(Integer  identity) {
        super("Unknown account");
        this.identity = identity;
    }

    public Integer getIdentity() {
        return identity;
    }
}
