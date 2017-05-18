package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by venkatasaiharsharavuri on 5/15/17.
 */
public class FileInput {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner mySc = new Scanner(new File("/Users/venkatasaiharsharavuri/Documents/JavaProjects/src/com/company/myData.txt"));
//        PrintWriter myWriter = new PrintWriter(new File("/Users/venkatasaiharsharavuri/Documents/JavaProjects/src/com/company/DobbyInfo.txt"));
//        String person = mySc.nextLine();
//        Double hours = mySc.nextDouble();
//        Double perHur = mySc.nextDouble();
//        Double earned = hours * perHur;
//        myWriter.println(person + " " + "worked " + hours + " per hours at $"+perHur+ " " + " and earned a total of $" +earned+"." );
//        mySc.close();
//        myWriter.close();
        Scanner mySc2 = new Scanner(new File("/Users/venkatasaiharsharavuri/Documents/JavaProjects/src/com/company/moreData.txt"));
        while (mySc2.hasNext()) {
            String name = mySc2.nextLine();
            Integer hours = mySc2.nextInt();
            Double perHour = mySc2.nextDouble();
            Double total = hours * perHour;
            System.out.println(name + " Worked " + hours + " at $" + perHour + " and earned total of $" + total + ".");
            if (mySc2.hasNext()) {
                mySc2.nextLine();
//                System.out.println(mySc2.nextLine());
            }
       }
//        System.out.println(name + " Worked " + hours + " at $" + perHour + " and earned total of $"+total+".");
       mySc2.close();
        }

    }


