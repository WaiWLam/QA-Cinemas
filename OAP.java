package com.qa.cinema;

public class OAP extends ID {

    @Override
    public void ID() {
        System.out.println("Did you know that if you are over 55 and have an ID, you may be eligible for an OAP ticket?");

    }
    public static void main(String[] args) {
        OAP oapObject = new OAP();
        oapObject.ID();
        System.out.println(oapObject.AcceptableID);
    }
}
