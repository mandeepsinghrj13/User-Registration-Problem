package com.bridgelabz;

import java.util.regex.Pattern;
/**
 * @author mandeep
 * Java provides an anotation @FunctionalInterface,
 * which is used to declare an interface as functional interface.
 */
@FunctionalInterface //It is optional
interface DataValidator{
    boolean validator(String pattern, String message);
}
/**
 * Creating a UserRegistrationLambda class & define Pattern
 * main method() validate the given string is true ot false
 */
public class UserRegistrationLambda {
    private static final String FIRST_NAME = "^[A-Z][a-z]{3,}$";
    private static final String LAST_NAME = "^[A-Z][a-z]{3,}$";
    private static final String EMAIL = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})$";
    private static final String PHONE_NUMBER = "^[0-9]{2}[ ][0-9]{10}";
    private static final String PASSWORD ="^^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}$";

    public static void main(String[] args) {
        DataValidator validate = (String pattern, String message) -> Pattern.matches(pattern, message);
        System.out.println("FirstName is "+ validate.validator(FIRST_NAME, "Mandeep"));
        System.out.println("LastName is " + validate.validator(LAST_NAME, "Singh"));
        System.out.println("EmailId is " + validate.validator(EMAIL, "mr.singh.1996@gmail.com"));
        System.out.println("PhoneNumber is " + validate.validator(PHONE_NUMBER, "91 1234567899"));
        System.out.println("password is " + validate.validator(PASSWORD, "MandeepSingh@12345"));
    }
}
