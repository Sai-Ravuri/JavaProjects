package arrays;

/**
 * Created by venkatasaiharsharavuri on 5/19/17.
 */
public class Numbers {
    public static void main(String[] args){
        int[] numbers = new int[20];
        for (int i=0; i<numbers.length; i++){
            numbers[i] = 3 * i + 1;
//            System.out.println(numbers);
        }
        for (int value : numbers){
            System.out.print(value+ " ");
        }
    }
}
