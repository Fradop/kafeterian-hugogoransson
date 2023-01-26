package kafeterian;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class SwitchTest {

    private CoffeeOrder c1 = new CoffeeOrder();
    

 @Test
 public void testSwitchCase1() {
     int choiceNum = 1;
     
     CoffeeType selectedCoffee = c1.selectCoffee(choiceNum);
     assertEquals("Americano", selectedCoffee.getType());
    }

    @Test
    public void testSwitchCase2() {
        int choiceNum = 2;

        CoffeeType selectedCoffee = c1.selectCoffee(choiceNum);
        assertEquals("Cappuccino", selectedCoffee.getType());
    }

    @Test
    public void testSwitchCase3() {
        int choiceNum = 3;

        CoffeeType selectedCoffee = c1.selectCoffee(choiceNum);
        assertEquals("Latte", selectedCoffee.getType());
    }

    @Test
    public void testSwitchCase4() {
        int choiceNum = 4;

        CoffeeType selectedCoffee = c1.selectCoffee(choiceNum);
        assertEquals("Mocha", selectedCoffee.getType());
    }

    @Test
    public void testSwitchCase5() {
        int choiceNum = 5;

        CoffeeType selectedCoffee = c1.selectCoffee(choiceNum);
        assertEquals("Espresso", selectedCoffee.getType());
    }

    @Test
    public void testSwitchCase6() {
        int choiceNum = 6;

        CoffeeType selectedCoffee = c1.selectCoffee(choiceNum);
        assertEquals("Macchiato", selectedCoffee.getType());
    }

    @Test
    public void testSwitchCase7() {
        int choiceNum = 7;

        CoffeeType selectedCoffee = c1.selectCoffee(choiceNum);
        assertEquals("Breve", selectedCoffee.getType());
    }

    @Test
    public void testSwitchCase8() {
        int choiceNum = 8;

        CoffeeType selectedCoffee = c1.selectCoffee(choiceNum);
        assertEquals("Drip Coffee", selectedCoffee.getType());
    }
}


   


