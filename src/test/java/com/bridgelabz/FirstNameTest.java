package com.bridgelabz;

import com.brodgelabz.exception.UserRegistrationEx;
import com.brodgelabz.exception.UserRegistrationException;
import org.junit.Assert;
import org.junit.Test;
/**
 * @author mandeep
 * @throw exception for FirstNameTest validation
 * exception with true or false condition with test case
 */
public class FirstNameTest {
    /**
     * exception with true case
     */
        @Test
        public void given_FirstName_ShouldReturn_True() {
            try {
                UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
               boolean result = userRegistrationEx.validFirstName("Man");
               Assert.assertTrue(result);
            } catch (UserRegistrationException e) {
                System.out.println(e.getMessage());
            }
        }

    /**
     * exception with false case
     */
    @Test
        public void given_FirstName_ShouldReturn_False() {
            try {
                UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
                boolean result = userRegistrationEx.validFirstName("as");
                Assert.assertFalse(result);
            } catch (UserRegistrationException e) {
                System.out.println(e.getMessage());
            }
        }

    /**
     * exception with false case
     */
    @Test
        public void given_FirstName_ShouldReturn_False_() {
            try {
                UserRegistrationEx userRegistrationEx = new UserRegistrationEx();
                boolean result = userRegistrationEx.validFirstName("Man@");
                Assert.assertFalse(result);
            } catch (UserRegistrationException e) {
                System.out.println(e.getMessage());
            }
        }
    }

