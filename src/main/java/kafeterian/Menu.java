package kafeterian;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;


public class Menu {

    private static final String COFFEE_MENU = """
            
                MENU
            0. Exit the program
            
            1. Espresso
            2. Americano
            3. Cappuccino
            4. Latte
            5. Mocha
            6. Macchiato
            7. Irish Coffee
            8. French Press

            9. See all orders

            """;

    public static String getCoffeeMenu() {
        return COFFEE_MENU;
    }
}
