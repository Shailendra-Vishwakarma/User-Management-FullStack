package com.cybersploit.exception;
/* Created by Arjun Gautam */

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){

        super("User id "+ id +" is not available in our database");
    }
}
