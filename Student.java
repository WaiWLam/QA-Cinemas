package com.qa.cinema;

public class Student extends ID {

    @Override
    public void ID() {

        System.out.println("Do you have a student NUS card?");

    }
    public static void main(String[] args) {
        Student nusObject = new Student();
        nusObject.ID();
        System.out.println(nusObject.AcceptableID);


    }
}
