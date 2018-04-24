package com.qa.cinema;

import java.util.Scanner;

public class ID {

    String AcceptableID = "Valid ID are Passport, Driving Licence, NUS Card and Biometric/ID card";

    public void ID() {
        System.out.println("Please ask the customer for ID, film rated 15.");
        System.out.println("input customer's age, please =>");

        Scanner aV = new Scanner(System.in);
        int age = aV.nextInt();

        if (age >= 15) {
            System.out.println("Age Verified");
        } else {
            System.out.println("Sorry, this film is age restricted");
        }
    }
    public static void main(String[] args){}

}
