package kafeterian;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

public class OrderTest {
    private Order order;
    private ArrayList<CoffeeType> drinks;


    
    @Before
    public void setUp() {
        drinks = new ArrayList<>();
        drinks.add(new CoffeeType("Latte"));
        drinks.add(new CoffeeType("Cappuccino"));
        order = new Order(drinks);
    }

    @Test
    public void testOrderCreation() {
        // check that the order object was created correctly with the correct drinks
        assertEquals(drinks, order.drinks);
    }

    @Test
    public void testDefaultOrderCreation() {
        Order order = new Order();
        assertNotNull(order.drinks);
        }




}
