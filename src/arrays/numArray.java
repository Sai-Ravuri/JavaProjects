package arrays;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by venkatasaiharsharavuri on 5/19/17.
 */
public class numArray {
    public static void main(String[] args) throws IOException
    {
        Scanner src = new Scanner(new File("/Users/venkatasaiharsharavuri/Documents/JavaProjects/src/arrays/arrayData.txt"));
        Integer[] numArray = new Integer[11];
        for (int i=0; i<numArray.length; i++){
            numArray[i] = src.nextInt();
        }
        for (int i= numArray.length-1; i>=0; i-- ){
            System.out.print(numArray[i]+ " ");
        }System.out.println();
        for (int i=0; i< numArray.length; i++){
            if (numArray[i]<0){
                System.out.print(numArray[i]+ " ");
            }
        }System.out.println();
        for (int i=0; i<numArray.length; i+=2){
            System.out.print(numArray[i]+ " ");
        }
        String[] strArray = new String[16];
        for (int i=0; i<strArray.length; i++){
            strArray[i] = src.next();
        }
        for (String str : strArray){
            System.out.println(str);
        }System.out.println();
        for (int i=0; i<strArray.length; i++ ){
            if (strArray[i].charAt(0) >= "H"){
                System.out.println(strArray[i]);
            }
        }
        System.out.println();
    }
}
