package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author mandeep
 * JUnit Parameterised Test to validate multiple entry for the Email Address.
 */
@RunWith(Parameterized.class)//Create a parameterized test class
public class UserRegistrationParameterizedTest {
    String email;
    String expectedOutput;
    /**
     * @param email
     * @param expectedOutput
     * Super keyword reference variable used to
     * refer immediate parent class object.
     */
    public UserRegistrationParameterizedTest(String email, String expectedOutput) {
        super();
        this.email = email;
        this.expectedOutput = expectedOutput;
    }
    /**
     * @return
     * Using @Parameters annotation to create a set of data to run our test.
     */
    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{{"abc@yahoo.com","true"},{"abc-100@yahoo.com","true"},{"abc.100@yahoo.com","true"},
                {"abc111@abc.com","true"},{"abc-100@abc.net","true"},{"abc.100@abc.com.au","true"},{"abc@1.com","true"},
                {"abc@gmail.com","true"},{"abc+100@gmail.com","true"}});
    }
    /**
     * Using @Test annotation to create our test.
     */
    @Test
    public void givenAllEmail_ShouldReturn_True_Or_False(){
        Assert.assertEquals(this.expectedOutput,expectedOutput);
    }
}
