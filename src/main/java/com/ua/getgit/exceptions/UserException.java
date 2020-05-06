package com.ua.getgit.exceptions;

public class UserException extends Exception {
    private String message;

    public UserException(String message){
        super(message);
        this.message=message;
    }

    public String getMessage(){
        return message;
    }




}
