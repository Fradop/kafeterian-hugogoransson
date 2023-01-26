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
    private ArrayList<CoffeeType> drinkList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private boolean continueOrdering = true;
    private String pathToJson = "src/main/java/kafeterian/json_files/Orders.json";
    public CoffeeType selectedCoffee;
    private Menu m = new Menu();
    private final String printCoffeMenu = m.getCoffeeMenu();


    /**
     * This method runs the menu and ordering process with a while loop, calls necessary methods to 
     * get the process running like it should
     */
    public  void startOrdering() {

        

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
        

        while (continueOrdering) {
       
            System.out.println(printCoffeMenu);

            String choice = scanner.nextLine();
            if(choice.equalsIgnoreCase("Q")){
                quitProgramSequence();
                break;
            }

            int choiceNum = Integer.parseInt(choice);
            selectedCoffee = selectCoffee(choiceNum);
    
            if(selectedCoffee != null){
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

 private void quitProgramSequence(){
                continueOrdering = false;
                ObjectMapper mapper2 = new ObjectMapper();
                ObjectWriter writer = mapper2.writer(new DefaultPrettyPrinter());
                try {
                writer.writeValue(new File(pathToJson), drinkList);
                } catch (IOException e) {
                    e.printStackTrace();
                }
 }


 public CoffeeType selectCoffee(int choiceNum) {
        
        CoffeeType selectedCoffeeType = null;
        switch (choiceNum) {
            case 1:
                selectedCoffeeType = new CoffeeType("Americano");
                break;
            case 2:
                selectedCoffeeType = new CoffeeType("Cappuccino");
                break;
            case 3:
                selectedCoffeeType = new CoffeeType("Latte");
                break;
            case 4:
                selectedCoffeeType = new CoffeeType("Mocha");
                break;
            case 5:
                selectedCoffeeType = new CoffeeType("Espresso");
                break;
            case 6:
                selectedCoffeeType = new CoffeeType("Macchiato");
                break;
            case 7:
                selectedCoffeeType = new CoffeeType("Breve");
                break;
            case 8:
                selectedCoffeeType = new CoffeeType("Drip Coffee");
                break;
            
            case 9:
                if(drinkList.isEmpty()){
                    System.out.println("The order list is empty");
                }
                for(CoffeeType coffeeType : drinkList){
                    System.out.println(coffeeType.getType() + " milk: " + coffeeType.getExtraMilk() + " sugar: " + coffeeType.getExtraSugar());
                }
                break;
                
            default:
                System.out.println("Invalid selection.");

            }
            return selectedCoffeeType;
        
        }

        public String getJSON(){
            return pathToJson;
        }
}




    


    
        
    
        
    


