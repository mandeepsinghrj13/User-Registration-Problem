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
    public void firstNameValidate() {

       System.out.print("Enter first Name : ");
       Scanner scanner = new Scanner(System.in);
       String firstName = scanner.next();
       System.out.println(Pattern.matches("^[A-Z]+[a-z]{2,}",firstName));
    }
    /**
     * Last name must start with Capital letter and has minimum 3 length
     */
    public static void lastNameValidate() {
        System.out.print("Enter last Name : ");
        Scanner scanner = new Scanner(System.in);
        String lastName = scanner.next();
        System.out.println(Pattern.matches("[A-Z]+[a-z]{2,}", lastName));
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
    /**
     * Phone number starts with 2 digit country code followed by space and 10 digit number
     */
    public static void phoneNumberValidate() {
        System.out.println("Enter mobile no. : ");
        Scanner scanner = new Scanner(System.in);
        String phNum = scanner.nextLine();
        System.out.println(Pattern.matches("^[0-9]{0,2}\\s{0,1}[0-9]{10}", phNum));
    }
    /**
     * Password contains minimum 8 characters
     */
    public static void passwordValidateRule1() {
        System.out.println("Rule 1 Password contains minimum 8 characters");
        System.out.print("Enter password Rule 1 : ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        System.out.println(Pattern.matches("^(?=.*[a-z]).{8,}$", password));
    }
    /**
     * Rule2 Should have at least 1 Upper Case
     */
    public static void passwordValidateRule2() {
        System.out.println("Rule2 Should have at least 1 Upper Case");
        System.out.print("Enter password Rule 2  : ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        System.out.println(Pattern.matches("^(?=.*[a-z])(?=.*[A-Z]).{8,}$", password));
    }
    /**
     * Rule 3 Should have at least 1 Numeric number
     */
    public static void passwordValidateRule3() {
        System.out.println("Rule 3 Should have at least 1 Numeric number");
        System.out.print("Enter password Rule 3  : ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        System.out.println(Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}$", password));
    }
    /**
     * Rule 4 Should have at least 1 Special Character  Like @#$%^&-+=
     */
    public static void passwordValidateRule4() {
        System.out.println("Rule 4 Should have at least 1 Special Character ");
        System.out.print("Enter password Rule 4  : ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        System.out.println(Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}$", password));
    }
}