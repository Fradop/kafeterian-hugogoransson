package kafeterian;


/**
 * This class holds the final string menu that prints when the program runs
 */
public class Menu {



    public final static String COFFEE_MENU = """
                Menu

            1. Americano
            2. Cappuccino
            3. Latte
            4. Mocha
            5. Espresso
            6. Macchiato
            7. Breve
            8. Drip Coffee
            9. Print all orders
            Q. Quit program

            """;


    public static String getCoffeeMenu() {
        return COFFEE_MENU;
    }
}
