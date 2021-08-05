package com.bridgelabz;

import com.brodgelabz.exception.UserRegistrationEx;
import com.brodgelabz.exception.UserRegistrationException;
import org.junit.Assert;
import org.junit.Test;
/**
 * @author mandeep
 * @throw exception for PhoneNumber validation
 * exception with true or false condition with test case
 */
public class PhoneNumberTest {
    /**
     * exception with true case
     */
    @Test
    public void given_PhoneNumber_ShouldReturn_True() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validMobileNumber("91 1234567890");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * exception with false case
     */
    @Test
    public void given_PhoneNumber_ShouldReturn_False() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validMobileNumber("91  1234567890");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * exception with false case
     */
    @Test
    public void given_PhoneNumber_ShouldReturn_False_with_Not_10Number() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validMobileNumber("91 123456789");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
}
