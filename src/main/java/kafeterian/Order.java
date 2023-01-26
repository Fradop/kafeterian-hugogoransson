package kafeterian;

import java.io.Serializable;
import java.util.ArrayList;

public class Order implements Serializable{
    ArrayList<CoffeeType> drinks = new ArrayList<>();

    Order(ArrayList<CoffeeType> drinks) {
        this.drinks = drinks;
    }
    Order() {}
}
