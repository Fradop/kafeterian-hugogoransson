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


public class test {
    public static void main(String[] args) {
        ArrayList<String> orders = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println(Menu.getCoffeeMenu());

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
                case 1:
                    order = "Espresso";
                    break;
                case 2:
                    order = "Americano";
                    System.out.print(extrasugar);
                    sugar = input.next();
                    if (sugar.equals("y")) {
                        addSugar = true;
                    }
                    System.out.print(extramilk);
                    milk = input.next();
                    if (milk.equals("y")) {
                        addMilk = true;
                    }
                    break;
                case 3:
                    order = "Cappuccino";
                    break;
                case 4:
                    order = "Latte";
                    break;
                case 5:
                    order = "Mocha";
                    break;
                case 6:
                    order = "Macchiato";
                    System.out.print(extrasugar);
                    sugar = input.next();
                    if (sugar.equals("y")) {
                        addSugar = true;
                    }
                    System.out.print(extramilk);
                    milk = input.next();
                    if (milk.equals("y")) {
                        addMilk = true;
                    }
                    break;
                case 7:
                    order = "Irish Coffee";
                    System.out.print(extrasugar);
                    sugar = input.next();
                    if (sugar.equals("y")) {
                        addSugar = true;
                    }
                    System.out.print(extramilk);
                    milk = input.next();
                    if (milk.equals("y")) {
                        addMilk = true;
                    }
                    break;
                case 8:
                    order = "French Press";
                    System.out.print(extrasugar);
                    sugar = input.next();
                    if (sugar.equals("y")) {
                        addSugar = true;
                    }
                    System.out.print(extramilk);
                    milk = input.next();
                    if (milk.equals("y")) {
                        addMilk = true;
                    }
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    continue;
            }
            
            if (addSugar) {
                order += " with extra sugar";
            }
            if (addMilk) {
                order += " with extra milk";
            }
            orders.add(order);
            System.out.println("Your order has been placed: " + order);



            // ObjectMapper mapper = new ObjectMapper();
            // ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
            // try {
            // writer.writeValue(new File("src/main/java/kafeterian/json_files"), orders);
            // } catch (IOException e) {
            //     e.printStackTrace();
            // }
        }
    }
}

