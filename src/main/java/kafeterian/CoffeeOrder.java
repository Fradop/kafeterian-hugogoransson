package kafeterian;

import java.util.ArrayList;
import java.util.Scanner;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.ObjectReader;
import java.io.File;
import java.io.IOException;




public class CoffeeOrder {
    private ArrayList<CoffeeType> orders = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private boolean continueOrdering = true;

    public void startOrdering() {
        while (continueOrdering) {
            System.out.println("Select a coffee:");
            System.out.println("1. Americano");
            System.out.println("2. Cappuccino");
            System.out.println("3. Latte");
            System.out.println("4. Mocha");
            System.out.println("5. Espresso");
            System.out.println("6. Macchiato");
            System.out.println("7. Breve");
            System.out.println("8. Drip Coffee");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // consume the newline character
            CoffeeType selectedCoffee = null;

            switch (choice) {
                case 1:
                    selectedCoffee = new CoffeeType("Americano");
                    break;
                case 2:
                    selectedCoffee = new CoffeeType("Cappuccino");
                    break;
                case 3:
                    selectedCoffee = new CoffeeType("Latte");
                    break;
                case 4:
                    selectedCoffee = new CoffeeType("Mocha");
                    break;
                case 5:
                    selectedCoffee = new CoffeeType("Espresso");
                    break;
                case 6:
                    selectedCoffee = new CoffeeType("Macchiato");
                    break;
                case 7:
                    selectedCoffee = new CoffeeType("Breve");
                    break;
                case 8:
                    selectedCoffee = new CoffeeType("Drip Coffee");
                    break;
                case 9:
                    continueOrdering = false;
                        ObjectMapper mapper = new ObjectMapper();
                        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
                        try {
                        writer.writeValue(new File("src/main/java/kafeterian/json_files/test.json"), orders);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;  
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            if (!continueOrdering || selectedCoffee == null) {
                break;
            }

            System.out.println("You selected a " + selectedCoffee.getType() + ".");
            if (selectedCoffee.getType().equals("Americano") || selectedCoffee.getType().equals("Mocha") || selectedCoffee.getType().equals("Macchiato") || selectedCoffee.getType().equals("Drip Coffee")) {
                System.out.println("Would you like extra milk? (y/n)");
                String extraMilkChoice = scanner.nextLine();
                selectedCoffee.setExtraMilk(extraMilkChoice.equalsIgnoreCase("y"));

                System.out.println("Would you like extra sugar? (y/n)");
                String extraSugarChoice = scanner.nextLine();
                selectedCoffee.setExtraSugar(extraSugarChoice.equalsIgnoreCase("y"));
            }

            System.out.println("Your " + selectedCoffee.getType() + " with " + (selectedCoffee.getExtraMilk() ? "extra milk " : "") + (selectedCoffee.getExtraSugar() ? "extra sugar." : ""));
            orders.add(selectedCoffee);
        }
        System.out.println("Thank you for ordering!");
        System.out.println("Orders:");
        for(CoffeeType order: orders){
            System.out.println(order.getType() + " with " + (order.getExtraMilk() ? "extra milk " : "") + (order.getExtraSugar() ? "extra sugar." : ""));
        }
    }
}

