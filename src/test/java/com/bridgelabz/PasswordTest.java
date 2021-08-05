package com.bridgelabz;

import com.brodgelabz.exception.UserRegistrationEx;
import com.brodgelabz.exception.UserRegistrationException;
import org.junit.Assert;
import org.junit.Test;
/**
 * @author mandeep
 * @throw exception for Password validation
 * exception with true or false condition with test case
 */
public class PasswordTest {
    /**
     * exception with true case
     */
    @Test
    public void given_Password_ShouldReturn_True() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validPassword("Mandeep@1234");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * exception with false case
     */
    @Test
    public void given_Password_ShouldReturn_False() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validPassword("mandeep!singh");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * exception with false case
     */
    @Test
    public void given_Password_Should_Return_False() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validPassword("Ma@12");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
}
