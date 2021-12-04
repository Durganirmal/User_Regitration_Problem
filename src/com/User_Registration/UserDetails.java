package com.User_Registration;


import java.util.Scanner;
public class UserDetails extends Regex {

	public static Scanner scan = new Scanner(System.in);
    public static String first_name, last_name, mail_ID, phone_number, password, check_mail;

    public static void main(String[] args) {
        UserDetails details = new UserDetails();
        details.firstname();

    }


    public static void firstname() {
        System.out.println("\nEnter the first name with first letter capital and name should be minimum 3 letters:");
        first_name = scan.next();
        Regex.name(first_name);
    }

}


