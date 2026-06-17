package com.example.department.exceptions;

public class MethodArgumentNotValidException extends RuntimeException {

    public MethodArgumentNotValidException(String message) {

        super("Not Valid: " + message);
    }
}
