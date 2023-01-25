package kafeterian;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.ObjectReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import kafeterian.Coffee;


public class test {
    public static void main(String[] args) {
        // Coffee.coffeeChoice("Ice coffee", false, false);
        // ArrayList<String> orders = new ArrayList<>();
        // Scanner input = new Scanner(System.in);

    
        // ArrayList<String> orders = new ArrayList<>();
        // Scanner input = new Scanner(System.in);

        ArrayList<Coffee> orders = new ArrayList<>();
        Scanner input = new Scanner(System.in);

    

    
    
        while (true) {
            System.out.println(Menu.getMainMenu());

            int selection = input.nextInt();
            if (selection == 0) {
                ObjectMapper mapper = new ObjectMapper();
                ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
                try {
                writer.writeValue(new File("src/main/java/kafeterian/json_files/test.json"), orders);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            if (selection == 9) {
                System.out.println("All orders: " + orders);
                continue;
            }
            boolean addSugar = false;
            boolean addMilk = false;
            String sugar = "Sugar";
            String milk = "milk";
            String order = "";
            String extrasugar = "Do you want extra sugar? (y/n) ";
            String extramilk = "Do you want extra milk? (y/n) ";
            
            switch (selection) {
          
                case 0:
                
                    ObjectMapper mapper = new ObjectMapper();
                    ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
                    try {
                    writer.writeValue(new File("src/main/java/kafeterian/json_files/test.json"), orders);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            
                case 1:
                    ArrayList<String> menu = Menu.getCoffeeMenu();
                    Integer x = 0;
                    // System.out.println(menu);
                    x = x-1;
                    System.out.println("What drink would you like to choose");
                    x = input.nextInt();
                    if (x == 1){
                        System.out.println(extramilk);
                    }
                    String ordertest = menu.get(x);
                    
                    Coffee coffee = Coffee.coffeeChoice(ordertest, false, false);
                    orders.add(coffee);
                    System.out.println(coffee.getType());
                    break;

                case 2:
                for (Coffee xy : orders) {
                    String drink = xy.getType();
                    boolean milk1 = xy.getExtraMilk();
                    boolean sugar1 = xy.getExtraSugar();
                    System.out.printf("""
                            Drink: %s
                            Extra milk: %s
                            Extra sugar: %s
                            """, drink, milk1, sugar1);
                    System.out.print("\n");
                    
                    
                    
                        
                    
                }
            
                default:
                    System.out.println("\nInvalid selection. Please try again.");
                    continue;
            }
            
            if (addSugar) {
                order += " with extra sugar";
            }
            if (addMilk) {
                order += " with extra milk";
            }
            System.out.println("Your order has been placed: " + order);
        }



           
    }
}


    


