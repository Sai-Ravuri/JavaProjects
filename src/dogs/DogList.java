package dogs;

import java.util.ArrayList;

/**
 * Created by venkatasaiharsharavuri on 5/22/17.
 */
public class DogList {
    private String dogName;
    private String dogBreed;
    private int yearOfBirth;
    public DogList(String dogName, String dogBreed, int yearOfBirth){
         this.dogName = dogName;
         this.dogBreed = dogBreed;
         this.yearOfBirth = yearOfBirth;
    }
    public String getDogName(){
        return dogName;
    }
    public String getDogBreed(){
        return dogBreed;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }
    @Override
    public String toString(){
       return String.format("%-15s %-20s %4d", dogName, dogBreed, yearOfBirth);
    }

}
