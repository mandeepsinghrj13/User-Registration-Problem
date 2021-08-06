package com.brodgelabz.exception;

import java.util.regex.Pattern;

/**
 * @author mandeep
 * @throw Exception
 *Code to throw custom exceptions in case of Invalid User Details for
 * writing all Test Cases to take in Custom
 * Exception for Invalid First Name, Last Name, Email, Mobile, and Password
 */
public  class UserRegistrationEx {
    /**
     * @param FirstName
     * @return true or false
     * @throws UserRegistrationException
     */
    public boolean validFirstName(String FirstName) throws UserRegistrationException{
        boolean result = Pattern.matches("^[A-z][a-z]{2,}$",FirstName);
        if (result)
            return true;
        else
            throw new UserRegistrationException("-----Invalid First Name--------");
    }

    /**
     * @param LastName
     * @return true or false
     * @throws UserRegistrationException
     */
    public boolean validLastName(String LastName) throws UserRegistrationException{
        boolean result = Pattern.matches("^[A-z][a-z]{2,}$",LastName);
        if (result)
            return true;
        else
            throw new UserRegistrationException("-----Invalid Last Name---------");
    }
    /**
     * @param MobileNumber
     * @return true or false
     * @throws UserRegistrationException
     */
    public boolean validMobileNumber(String MobileNumber) throws UserRegistrationException{
        boolean result = Pattern.matches("^[0-9]{0,2}\\s{0,1}[0-9]{10}",MobileNumber);
        if (result)
            return true;
        else
            throw new UserRegistrationException("-----Invalid Mobile Number---------");
    }
    /**
     * @param Email
     * @return true or false
     * @throws UserRegistrationException
     */
    public boolean validEmail(String Email) throws UserRegistrationException{
        boolean result = Pattern.matches("^[a-zA-Z]+([.][a-zA-Z]+)*@[a-zA-Z]+[.][a-zA-Z]{2,3}+([.][a-zA-Z]{2}+)*$",Email);
        if (result)
            return true;
        else
            throw new UserRegistrationException("-----Invalid Your Email---------");
    }

    /**
     * @param Password
     * @return true or false
     * @throws UserRegistrationException
     */
    public boolean validPassword(String Password) throws UserRegistrationException{
        boolean result = Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$)(?=.*[0-9]).{8,}$",Password);
        if (result)
            return true;
        else
            throw new UserRegistrationException("-----Invalid Your Password---------");
    }

}
