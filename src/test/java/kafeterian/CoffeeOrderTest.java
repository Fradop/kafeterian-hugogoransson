package kafeterian;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class CoffeeOrderTest {


    @Test
    public void pathToJsonTest() {
        String expectedPath = "src/main/java/kafeterian/json_files/Orders.json";
        CoffeeOrder c = new CoffeeOrder();
        String actualPath = c.getJSON();
        assertEquals(expectedPath, actualPath);
    }

    }





