package com.company;

import java.util.*;
import java.util.Scanner;

/**
 * Created by venkatasaiharsharavuri on 5/12/17.
 */
public class BookFinal {
    public static void main(String[] args){
        java.util.Scanner book = new Scanner(System.in);

        System.out.println("Enter the name of the Author");
        /*String author_name = book.nextLine();*/
        String firstName = book.next();
        String lastName = book.next();
        System.out.println("Enter title of the Book:");
        String book_title = book.next();
        System.out.println("Book name:"+" "+book_title);
        /*String bookName = book.next();*/
        System.out.println(book_title + " is writen by " + firstName + lastName);
        System.out.println("Author First name:" + " " + firstName);
        System.out.println("Author Last name:" + " " + lastName);


    }
}
