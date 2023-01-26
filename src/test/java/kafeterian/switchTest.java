package kafeterian;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import java.io.ByteArrayInputStream;
import java.io.InputStream;


public class switchTest {

    @Test
    public void testSwitchCase1() {
        CoffeeType newCoffee = new CoffeeType("Americano");
        CoffeeOrder coffeeOrder = new CoffeeOrder();
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        coffeeOrder.startOrdering();
        assertEquals(newCoffee, "Americano");
    }
}

