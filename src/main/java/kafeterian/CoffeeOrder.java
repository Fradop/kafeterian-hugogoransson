package kafeterian;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.io.File;
import java.io.IOException;

/**
 * This class handles the ordering process
 */
public class CoffeeOrder {
    private static ArrayList<Order> orders = new ArrayList<>();
    private static ArrayList<CoffeeType> drinkList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static boolean continueOrdering = true;
    public static String pathToJson = "src/main/java/kafeterian/json_files/Orders.json";


    /**
     * This method runs the menu and ordering process with a while loop, calls necessary methods to 
     * get the process running like it should
     */
    public static void startOrdering() {

        // HandleJson.readJson(drinkList);

        ObjectMapper mapper = new ObjectMapper();
        File jsonFile = new File(pathToJson);
        if(jsonFile.exists()){
            try {
                List<CoffeeType> orders = mapper.readValue(jsonFile, new TypeReference<List<CoffeeType>>(){});
                drinkList.addAll(orders);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        String printCoffeMenu = Menu.getCoffeeMenu();



        while (continueOrdering) {
       
            System.out.println(printCoffeMenu);

            String choice = scanner.nextLine();
            CoffeeType selectedCoffee = null;
            if(choice.equalsIgnoreCase("Q")){
                ObjectMapper mapper2 = new ObjectMapper();
                ObjectWriter writer = mapper2.writer(new DefaultPrettyPrinter());
                try {
                writer.writeValue(new File(pathToJson), drinkList);
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
                    for(CoffeeType coffeeType : drinkList){
                        System.out.println(coffeeType.getType() + " milk: " + coffeeType.getExtraMilk() + " sugar: " + coffeeType.getExtraSugar());
                    }
                    // System.out.println(drinkList);
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


    public Object selectedCoffee;


    public void selectCoffee(int choiceNum) {
    }
    }
    
        
    
        
    


