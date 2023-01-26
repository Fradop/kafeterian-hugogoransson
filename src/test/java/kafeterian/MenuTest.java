package kafeterian;

import org.junit.Test;
import static org.junit.Assert.*;


public class MenuTest {

    @Test
    public void testGetCoffeeMenu() {
        String expectedMenu = """
                Menu

            1. Americano
            2. Cappuccino
            3. Latte
            4. Mocha
            5. Espresso
            6. Macchiato
            7. Breve
            8. Drip Coffee
            9. Print all orders
            Q. Quit program

            """;
            
        String actualMenu = Menu.getCoffeeMenu();
        assertEquals(expectedMenu, actualMenu);
    }
}


