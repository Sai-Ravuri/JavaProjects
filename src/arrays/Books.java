package arrays;

/**
 * Created by venkatasaiharsharavuri on 5/18/17.
 */
public class Books {
    private String title;
    private Double price;
    public Books(String title, Double price){
        this.title = title;
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public Double getPrice(){
        return price;
    }
    @Override
    public String toString(){
        return "The price of " + getTitle() + " is $" + getPrice();
    }
}
