package kafeterian;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;


public class Menu {

    private static final String MAIN_MENU = """
                Main Menu

            0. Exit the program
            1. Make an order
            2. Print all orders

            """;

        public static String getMainMenu() {
            return MAIN_MENU;
        }



    private static final String COFFEE_MENU = """
            
                Coffee Menu
            
            
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

    public static ArrayList<String> getCoffeeMenu() {
        ArrayList<String> menu = new ArrayList<>();
        menu.add("Espresso");
        menu.add("Americano");
        menu.add("Cappuccino");
        menu.add("Latte");
        menu.add("Mocha");
        menu.add("Macchiato");
        menu.add("Irish Coffee");
        menu.add("French Press");
        System.out.println(COFFEE_MENU);
        return menu;
    }
}
