package kafeterian;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ObjectReader;
import java.io.File;
import java.io.IOException;








import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CoffeeOrder {
    private static ArrayList<Order> orders = new ArrayList<>();
    private static ArrayList<CoffeeType> drinkList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static boolean continueOrdering = true;

    public static void startOrdering() {

        // HandleJson.readJson(drinkList);

        ObjectMapper mapper = new ObjectMapper();
        File jsonFile = new File("src/main/java/kafeterian/json_files/Orders.json");
        if(jsonFile.exists()){
            try {
                List<CoffeeType> orders = mapper.readValue(jsonFile, new TypeReference<List<CoffeeType>>(){});
                drinkList.addAll(orders);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




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
            System.out.println("9. Print all orders");
            System.out.println("Q. Quit program");

            String choice = scanner.nextLine();
            CoffeeType selectedCoffee = null;
            if(choice.equalsIgnoreCase("Q")){
                ObjectMapper mapper2 = new ObjectMapper();
                ObjectWriter writer = mapper2.writer(new DefaultPrettyPrinter());
                try {
                writer.writeValue(new File("src/main/java/kafeterian/json_files/Orders.json"), drinkList);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                // HandleJson.writeJson(selectedCoffee);
                break;
            }
            int choiceNum = Integer.parseInt(choice);

            switch (choiceNum) {
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
                    if(drinkList.isEmpty()){
                        System.out.println("The order list is empty");
                        continue;
                    }
                    // for(Order o : orders){
                    //     System.out.println(o);
                    // }
                    System.out.println(drinkList);
                    continue;
                    default:
                    System.out.println("Invalid selection.");
                    continue;
                }
                if (!continueOrdering || selectedCoffee == null) {
                    break;
                }
                drinkList.add(selectedCoffee);
                System.out.println("You selected a " + selectedCoffee.getType() + ".");
                if (selectedCoffee.getType().equals("Americano") || selectedCoffee.getType().equals("Mocha") || selectedCoffee.getType().equals("Macchiato") || selectedCoffee.getType().equals("Drip Coffee")) {
                    System.out.println("Would you like extra milk? (y/n)");
                    String extraMilkChoice = scanner.nextLine();
                    selectedCoffee.setExtraMilk(extraMilkChoice.equalsIgnoreCase("y"));
    
                    System.out.println("Would you like extra sugar? (y/n)");
                    String extraSugarChoice = scanner.nextLine();
                    selectedCoffee.setExtraSugar(extraSugarChoice.equalsIgnoreCase("y"));
                }
            }
        }
    }
    
        
    


