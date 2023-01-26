package kafeterian;


/**
 * 
 */
public class Menu {



    public static final String COFFEE_MENU = """
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
