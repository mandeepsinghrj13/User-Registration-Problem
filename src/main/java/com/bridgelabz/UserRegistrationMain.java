package com.bridgelabz;
public class UserRegistrationMain {
    /**
     * @author Mandeep
     * Creating a main method
     */
    public static void main(String[] args) {
        /**
         * Welcome message
         */
        System.out.println("------Welcome to User Registration-----");
        /**
         * Creating A Object
         */
        UserRegistration userRegistration = new UserRegistration();
        /**
         * Calling method throw Object reference
         */
        userRegistration.firstNameValidate();
        userRegistration.lastNameValidate();
        userRegistration.emailValidate();
        userRegistration.phoneNumberValidate();
    }
}
