package arrays;

import java.util.ArrayList;

/**
 * Created by venkatasaiharsharavuri on 5/18/17.
 */
public class bookDriver {
    public static void main(String[] args){
        ArrayList<Books> myBooks = new ArrayList<Books>();
        myBooks.add(new Books("Horse Heaven", 17.00));
        myBooks.add(new Books("Data Warehousing", 75.50));
        myBooks.add(new Books("The Kite Runner", 25.00));
        myBooks.add(new Books("The Iliad", 23.75));
        for (Books b : myBooks){
            System.out.println(b);
        }System.out.println();
        myBooks.set(1,new Books("Web Services", 70.00));
        for (Books b : myBooks){
            System.out.println(b);
        }System.out.println();
        Double sum = 0.00;
        for (Books b: myBooks){
            sum += b.getPrice();
        }System.out.println("Average price of books :" + sum/myBooks.size());
        sum = 0.00;
        int count=0;
        for (Books b: myBooks){
            if (b.getPrice() > 20){
                sum += b.getPrice();
                count++;
            }
        }System.out.println("Average price of the books in the list\n" +
                "\t// that cost more than $20\n"+ sum/count);
        String[] bookTitle = new String[5];
        int i=0;
        for (Books b : myBooks){
            bookTitle[i] = b.getTitle();
            i++;
        }
        for (String str : bookTitle ){
            System.out.println(str);
        }
        myBooks.remove(1);
        for (Books b : myBooks){
            System.out.println(b);
        }
    }
}
