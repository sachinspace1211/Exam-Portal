package com.examportal.app.exceptions;

public class UserDoesNotExistException extends Exception{

    public UserDoesNotExistException(String message) {
        super(message);
    }

}
