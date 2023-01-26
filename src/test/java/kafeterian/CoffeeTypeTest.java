package kafeterian;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CoffeeTypeTest {
    
    @Test
    public void testCoffeeType() {
        CoffeeType coffeeType = new CoffeeType("Latte", true, false);
        assertEquals("Latte", coffeeType.getType());
        assertTrue(coffeeType.getExtraMilk());
        assertFalse(coffeeType.getExtraSugar());
    }

}
