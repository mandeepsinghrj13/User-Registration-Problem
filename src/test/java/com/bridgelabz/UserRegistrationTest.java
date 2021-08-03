package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;
/**
 * @author mandeep
 * Write JUnit Test to validate the Given
 * Entry for First Name, Last Name,
 * Email, Mobile, and Password.
 * All the case are passed
 */
public class UserRegistrationTest {
    /**
     * Test for The First_Name passed by( 1 given True & 2 for false)
     */
    @Test
    public void givenValid_FirstName_ShouldReturn_True(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.firstNameValidate("Mandeep");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenInValid_FirstName_ShouldReturn_False(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.firstNameValidate("mandeep");
        Assert.assertFalse( result);
    }
    @Test
    public void givenInValid_FirstName_ShouldReturn_False_Numeric_number(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.firstNameValidate("Mandeep123");
        Assert.assertFalse( result);
    }
    /**
     *     Test for The Last_Name passed by( 1 given True & 2 for false)
     */
    @Test
    public void givenValid_LastName_ShouldReturn_True(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.lastNameValidate("Singh");
        Assert.assertTrue(result);
    }
    @Test
    public void givenValid_LastName_ShouldReturn_False(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.lastNameValidate("singh");
        Assert.assertFalse(result);
    }
    @Test
    public void givenValid_LastName_ShouldReturn_False_Numeric_number(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.lastNameValidate("123singh");
        Assert.assertFalse(result);
    }

    /**
     *     Test for The Email passed by( 1 given True & 2 for false)
     */
    @Test
    public void givenValid_Email_ShouldReturn_True(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.emailValidate("mandeepsingh@yahoo.com.in");
        Assert.assertTrue(result);
    }
    @Test
    public void givenValid_Email_ShouldReturn_False(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.emailValidate("abc@.com.my");
        Assert.assertFalse(result);
    }
    @Test
    public void givenValid_Email_ShouldReturn_False_Special_Character(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.emailValidate("abc@abc@gmail.com");
        Assert.assertFalse(result);
    }

    /**
     *     Test for The Phone_Number passed by( 1 given True & 2 for false)
     */
    @Test
    public void givenValid_Phone_Number_ShouldReturn_True(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.phoneNumberValidate("91 9166667789");
        Assert.assertTrue(result);
    }
    @Test
    public void givenValid_Phone_Number_ShouldReturn_False(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.phoneNumberValidate("91 12345678910");
        Assert.assertFalse(result);
    }
    @Test
    public void givenValid_Phone_Number_ShouldReturn_False_Number_Should_10(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.phoneNumberValidate("91  12345678");
        Assert.assertFalse(result);
    }

    /**
     *     Test for The Password passed by( 1 given True & 2 for false)
     */
    @Test
    public void givenValid_Password_ShouldReturn_True(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.passwordValidate("Mandeep@1234");
        Assert.assertTrue(result);
    }
    @Test
    public void givenValid_Password_ShouldReturn_False(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.passwordValidate("Ram.123");
        Assert.assertFalse(result);
    }
    @Test
    public void givenValid_Password_ShouldReturn_False_Should_8_Character(){
        UserRegistrationRegExTest userRegistration = new UserRegistrationRegExTest();
        boolean result = userRegistration.passwordValidate("pass@1");
        Assert.assertFalse(result);
    }

}
