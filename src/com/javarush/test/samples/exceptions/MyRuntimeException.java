package com.javarush.test.samples.exceptions;

public class MyRuntimeException extends RuntimeException {

    public MyRuntimeException() {
        super();
    }
    public MyRuntimeException(String descry) {
        super(descry);
    }
}
