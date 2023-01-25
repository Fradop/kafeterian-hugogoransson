package kafeterian;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.ObjectReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class CoffeeShopMain {
    public static void main(String[] args) {
        
        CoffeeOrder.startOrdering();
        ObjectMapper obj = new ObjectMapper();
        ArrayList<CoffeeType> neworder = new ArrayList();
        CoffeeType newcoffee = new CoffeeType("Testing", true, false);
        
        // CoffeeOrder order = new CoffeeOrder();
        // try {
        //     CoffeeType[] newOrder = obj.readValue(new File("src/main/java/kafeterian/json_files/test.json"), CoffeeType[].class);
        //     for (CoffeeType test : newOrder) {
        //         System.out.println(test.getType());
                
        //     }
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
    }
}

