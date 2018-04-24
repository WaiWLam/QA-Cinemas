package com.qa.cinema;

import java.util.Scanner;
import java.util.Calendar;

public class Main {

/* You are required to create a simple prototype cinema system that provide the ability to purchase tickets and return the total price of a customer’s order.
Ticket prices for all movies at this cinema are as follows:

Ticket prices:
•Standard - £8
•OAP - £6
•Student - £6
•Child - £4

*/

    public static void main(String[] args) {

        ID idObject = new ID ();
        idObject.ID();

        System.out.println(" ");

        Student nusObject = new Student();
        nusObject.ID();

        System.out.println(" ");

        OAP oapObject = new OAP();
        oapObject.ID();

        System.out.println(" ");

        Scanner sQ = new Scanner(System.in);
        System.out.println("Please enter how many standard tickets you require? if n/a, please enter 0");
        System.out.println("input, please =>");
        int standardQty = sQ.nextInt();

        Scanner oQ = new Scanner(System.in);
        System.out.println("Please enter how many OAP tickets you require? if n/a, please enter 0");
        System.out.println("input, please =>");
        int seniorQty = oQ.nextInt();

        Scanner stQ = new Scanner(System.in);
        System.out.println("Please enter how many student tickets you require? if n/a, please enter 0");
        System.out.println("input, please =>");
        int studentQty = stQ.nextInt();

        Scanner cQ = new Scanner(System.in);
        System.out.println("Please enter how many child tickets you require? if n/a, please enter 0");
        System.out.println("input, please =>");
        int childQty = cQ.nextInt();

        System.out.println(" ");

        Calendar now = Calendar.getInstance();

        int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);

        if (Calendar.WEDNESDAY == dayOfWeek) {

            int totalStandard = 6 * standardQty;
            System.out.println("Standard" + " " + "£" + totalStandard);

            int totalOap = 4 * seniorQty;
            System.out.println("OAP" + " " + "£" + totalOap);

            int totalStudent = 4 * studentQty;
            System.out.println("Student" + " " + "£" + totalStudent);

            int totalChild = 2 * childQty;
            System.out.println("Child" + " " + "£" + totalChild);

            int total = totalStandard + totalOap + totalStudent + totalChild;

            int totalsaving = (standardQty * 2) + (seniorQty * 2) + (studentQty * 2) + (childQty * 2);

            System.out.println("The total cost for this movie is" + " " + "£" + total);

            System.out.println("The total saving:" + " " + "£" + totalsaving);

        }

        else {

            int totalStandard = 8 * standardQty;
            System.out.println("Standard" + " " + "£" + totalStandard);

            int totalOap = 6 * seniorQty;
            System.out.println("OAP" + " " + "£" + totalOap);

            int totalStudent = 6 * studentQty;
            System.out.println("Student" + " " + "£" + totalStudent);

            int totalChild = 4 * childQty;
            System.out.println("Child" + " " + "£" + totalChild);

            int total = totalStandard + totalOap + totalStudent + totalChild;

            System.out.println("The total cost for this movie is" + " " + "£" + total);

        }

        System.out.println(now.getTime());

        Employee obj = new Employee();
        obj.setEmpName("Hannah Womack");

        System.out.println("You were served by" + " " + obj.getEmpName());

    }

}

