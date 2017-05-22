package array2D;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by venkatasaiharsharavuri on 5/22/17.
 */
public class numArray2D {
    public static void main(String[] args) throws FileNotFoundException{
    Scanner in = new Scanner(new File("/Users/venkatasaiharsharavuri/Documents/JavaProjects/src/array2D/2dArrayData.txt"));
    final int row = 4;
    final int col = 3;
    int[][] array2D= new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array2D[i][j] = in.nextInt();
            }
        }
        for (int i =0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print(array2D[i][j] + " ");
            }System.out.println();
        }System.out.println();
    int sum = 0;
    int cal = row * col;
    for (int i=0; i< row; i++){
        for (int j=0; j< col; j++){
            sum += array2D[i][j];
        }
    }
    double Average = sum / cal;
        System.out.println("Average is"+ Average);
        System.out.println("Average value greater than average:");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                if (array2D[i][j] > Average){
                System.out.print(array2D[i][j]+ " ");
                }
            }
        }
    }


}
