package kafeterian;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class CoffeeOrderTest {


    @Test
    public void pathToJsonTest() {
        String expectedPath = "src/main/java/kafeterian/json_files/Orders.json";
        String actualPath = CoffeeOrder.pathToJson;
        assertEquals(expectedPath, actualPath);
    }




    @Test
    public void testStartOrdering() {
        // Set input for test
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Call the method being tested
        CoffeeOrder.startOrdering();

        // Verify that the menu is displayed correctly and a valid selection can be made
        String expectedMenu = Menu.getCoffeeMenu();
        String output = captureOutput(CoffeeOrder::startOrdering);
        assertTrue(output.contains(expectedMenu));
        assertTrue(output.contains("You selected a Americano."));
    }

    private String captureOutput(Runnable runnable) {
        return null;
        // code to capture the output of the runnable method
    }
}




