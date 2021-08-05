package com.bridgelabz;

import com.brodgelabz.exception.UserRegistrationEx;
import com.brodgelabz.exception.UserRegistrationException;
import org.junit.Assert;
import org.junit.Test;
/**
 * @author Mandeep
 * @throw exception for emailtest validation
 * exception with true or false condition with test case
 */
public class EmailTest {
    /**
     * exception with true case
     */
    @Test
    public void given_Email_ShouldReturn_True() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validEmail("mandeep.singh@gmail.com.in");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * exception with false case
     */
    @Test
    public void given_Email_ShouldReturn_False() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validEmail("mandeep@singh@gmail.co");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * exception with false case
     */
    @Test
    public void given_Email_Should_Return_False() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validEmail("mandeep.singh@gmail.com.ind");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

}
