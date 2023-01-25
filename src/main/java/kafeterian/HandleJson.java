package kafeterian;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class HandleJson {
    
    // private static List<CoffeeType> drinkList;

    public static void readJson(List<CoffeeType> drinkList){
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
    }

    public static void writeJson(Object drinkList) {
        ObjectMapper mapper2 = new ObjectMapper();
        ObjectWriter writer = mapper2.writer(new DefaultPrettyPrinter());
        try {
        writer.writeValue(new File("src/main/java/kafeterian/json_files/Orders.json"), drinkList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
