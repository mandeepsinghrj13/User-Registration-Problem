package com.bridgelabz;
import java.util.regex.Pattern;
/**
 * @author mandeep
 */
public class UserRegistrationRegExTest {
   private static final String LAST_NAME = "[A-Z][a-z]{2,}+$";
   private static final String PHONE_NUMBER = "^[0-9]{0,2}\\s{0,1}[0-9]{10}";
   private static final String EMAIL ="^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$";
   private static final String PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}$";

    public boolean firstNameValidate(String firstname) {
        return Pattern.matches("[A-Z][a-z]{2,}",firstname);
    }
    public boolean lastNameValidate(String lastName) {
        return Pattern.matches(LAST_NAME, lastName);
    }
    public boolean emailValidate(String email) {
        return Pattern.matches(EMAIL, email);
    }
    public boolean phoneNumberValidate(String phoneNumber){
        return Pattern.matches(PHONE_NUMBER, phoneNumber);
    }
    public boolean passwordValidate(String password){
        return Pattern.matches(PASSWORD,password);
    }
}
