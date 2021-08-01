package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * @author mandeep
 */
public class UserRegistration {
    /**
     * First name must start with Capital letter and has minimum 3 length
     */
    public static void firstNameValidate() {
        System.out.print("Enter first Name : ");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstName));
    }
    /**
     * Last name must start with Capital letter and has minimum 3 length
     */
    public static void lastNameValidate() {
        System.out.print("Enter last Name : ");
        Scanner scanner = new Scanner(System.in);
        String lastName = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", lastName));
    }
}