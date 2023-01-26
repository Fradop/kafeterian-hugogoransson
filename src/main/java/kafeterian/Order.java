package kafeterian;

import java.io.Serializable;
import java.util.ArrayList;
/**
 * This class is not used in the moment 
 */
public class Order implements Serializable{
    ArrayList<CoffeeType> drinks = new ArrayList<>();

    Order(ArrayList<CoffeeType> drinks) {
        this.drinks = drinks;
    }
    Order() {}
}
