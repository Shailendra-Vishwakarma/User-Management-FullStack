package com.cybersploit.exception;
/* Created by Arjun Gautam */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserNotFoundException extends RuntimeException{
    Logger log= LoggerFactory.getLogger(UserNotFoundException.class);
    public UserNotFoundException(Long id){
        super("User id "+ id +" is not available in our database");
        log.debug("User "+id+" not found");
    }
}
