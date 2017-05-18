package students;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by venkatasaiharsharavuri on 5/17/17.
 */
public class StudentsDriver {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner in = new Scanner(new File("/Users/venkatasaiharsharavuri/Documents/JavaProjects/src/students/students.txt"));
        while (in.hasNext()){
            String stdID = in.next();
            String classification = in.nextLine();
            String name = in.nextLine();
            Double gpa = in.nextDouble();
            System.out.print("");
            Students std = new Students(stdID, classification, name, gpa );
            System.out.print(std+ " ");
            System.out.printf("%-10s %2d %-10s %-10s %10s",
                    std.getFirstName(), std.getNameCount(), std.getname(0), std.getname(2), std.getname(5),
                            std.getfirstNameReversed());
            System.out.println();
        }
    }
}
