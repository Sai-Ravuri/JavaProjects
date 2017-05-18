package com.company;



/**
 * Created by venkatasaiharsharavuri on 5/12/17.
 */
public class Scanner {
    public static void main (String[] arg){
        java.util.Scanner scIn = new java.util.Scanner(System.in);
        Integer hours_Worked;
        Double hourly_Pay;

        System.out.println("Enter name:");

        String first_name = scIn.next();
        String second_name = scIn.next();
        System.out.println("Enter number of hours worked");
        hours_Worked = scIn.nextInt();
        System.out.println("Enter amount paid hourly");
        hourly_Pay = scIn.nextDouble();
        System.out.println(first_name + " " + second_name + " " +"amount Earned" + " " +( hours_Worked * hourly_Pay));
        System.out.println("First Name:");

        System.out.println("First name is:" +  first_name);

        System.out.println("Last name is:" +  second_name);
        scIn.close();



    }
}
