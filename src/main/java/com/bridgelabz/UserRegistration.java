package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * @author Mandeep
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

    /**
     * Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
     * E.g. abc.xyz@bl.co.in
     */
    public static void emailValidate() {
        System.out.print("Enter Email : ");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();
        System.out.println(Pattern.matches("^[a-zA-Z]+([.][a-zA-Z]+)*@[a-zA-Z]+[.][a-zA-Z]{2,3}+([.][a-zA-Z]+)*$", email));
    }
}