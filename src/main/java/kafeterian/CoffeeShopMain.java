package kafeterian;

/**
 * This class starts the program and calls necessary functions.
 */
public class CoffeeShopMain {

    /**
     * This method calls on the necessary function to start the ordering process.
     * @param args
     */
    public static void main(String[] args) {
        CoffeeOrder c = new CoffeeOrder();
        c.startOrdering();
       
    }
}

