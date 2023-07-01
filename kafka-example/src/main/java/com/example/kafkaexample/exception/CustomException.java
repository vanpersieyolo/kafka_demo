package com.example.kafkaexample.exception;

public class CustomException extends RuntimeException {
    private final String error;

    public CustomException(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
