package com.brodgelabz.exception;

/**
 * @author Mandeep
 * Taking inbuid exception from java.lang
 */
public class UserRegistrationException extends Exception{
    /**
     * @param message
     * creating class constructor
     */
    public UserRegistrationException( String message){
        super(message);
    }

}