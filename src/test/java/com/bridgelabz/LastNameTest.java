package com.bridgelabz;

import com.brodgelabz.exception.UserRegistrationEx;
import com.brodgelabz.exception.UserRegistrationException;
import org.junit.Assert;
import org.junit.Test;
/**
 * @author mandeep
 * @throw exception for LastNameTest validation
 * exception with true or false condition with test case
 */
public class LastNameTest {
    /**
     * exception with true case
     */
    @Test
    public void given_LastName_ShouldReturn_True() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validLastName("San");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * exception with false case
     */
    @Test
    public void given_LastName_ShouldReturn_False() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validLastName("ma");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * exception with false case
     */
    @Test
    public void given_LastName_ShouldReturn_False_With_Spacial_Char() {
        try {
            UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
            boolean result = userRegistrationEx.validLastName("@San");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
}
