package kafeterian;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SwitchTest {

    @Test
    public void testSwitchCase1() {
        int choiceNum = 1;
        CoffeeType selectedCoffee = null;
        switch (choiceNum) {
            case 1:
                selectedCoffee = new CoffeeType("Americano");
                break;
            case 2:
                selectedCoffee = new CoffeeType("Cappuccino");
                break;
                case 3:
                selectedCoffee = new CoffeeType("Latte");
                break;
            case 4:
                selectedCoffee = new CoffeeType("Mocha");
                break;
            case 5:
                selectedCoffee = new CoffeeType("Espresso");
                break;
                case 6:
                selectedCoffee = new CoffeeType("Macchiato");
                break;
            case 7:
                selectedCoffee = new CoffeeType("Breve");
                break;
            case 8:
                selectedCoffee = new CoffeeType("Drip Coffee");
                break;
            
            
                default:
                System.out.println("Invalid selection.");

        }
        assertEquals("Americano", selectedCoffee.getType());
    }

    @Test
    public void testSwitchCase2() {
        int choiceNum = 2;
        CoffeeType selectedCoffee = null;
        switch (choiceNum) {
            case 1:
                selectedCoffee = new CoffeeType("Americano");
                break;
            case 2:
                selectedCoffee = new CoffeeType("Cappuccino");
                break;
                case 3:
                selectedCoffee = new CoffeeType("Latte");
                break;
            case 4:
                selectedCoffee = new CoffeeType("Mocha");
                break;
            case 5:
                selectedCoffee = new CoffeeType("Espresso");
                break;
                case 6:
                selectedCoffee = new CoffeeType("Macchiato");
                break;
            case 7:
                selectedCoffee = new CoffeeType("Breve");
                break;
            case 8:
                selectedCoffee = new CoffeeType("Drip Coffee");
                break;
            
            
                default:
                System.out.println("Invalid selection.");
        }
        assertEquals("Cappuccino", selectedCoffee.getType());
    }


    @Test
    public void testSwitchCase3() {
        int choiceNum = 3;
        CoffeeType selectedCoffee = null;
        switch (choiceNum) {
            case 1:
                selectedCoffee = new CoffeeType("Americano");
                break;
            case 2:
                selectedCoffee = new CoffeeType("Cappuccino");
                break;
                case 3:
                selectedCoffee = new CoffeeType("Latte");
                break;
            case 4:
                selectedCoffee = new CoffeeType("Mocha");
                break;
            case 5:
                selectedCoffee = new CoffeeType("Espresso");
                break;
                case 6:
                selectedCoffee = new CoffeeType("Macchiato");
                break;
            case 7:
                selectedCoffee = new CoffeeType("Breve");
                break;
            case 8:
                selectedCoffee = new CoffeeType("Drip Coffee");
                break;
            
            
                default:
                System.out.println("Invalid selection.");
        }
        assertEquals("Latte", selectedCoffee.getType());
    }



    @Test
    public void testSwitchCase4() {
        int choiceNum = 4;
        CoffeeType selectedCoffee = null;
        switch (choiceNum) {
            case 1:
                selectedCoffee = new CoffeeType("Americano");
                break;
            case 2:
                selectedCoffee = new CoffeeType("Cappuccino");
                break;
                case 3:
                selectedCoffee = new CoffeeType("Latte");
                break;
            case 4:
                selectedCoffee = new CoffeeType("Mocha");
                break;
            case 5:
                selectedCoffee = new CoffeeType("Espresso");
                break;
                case 6:
                selectedCoffee = new CoffeeType("Macchiato");
                break;
            case 7:
                selectedCoffee = new CoffeeType("Breve");
                break;
            case 8:
                selectedCoffee = new CoffeeType("Drip Coffee");
                break;
            
            
                default:
                System.out.println("Invalid selection.");
        }
        assertEquals("Mocha", selectedCoffee.getType());
    }




    @Test
    public void testSwitchCase5() {
        int choiceNum = 5;
        CoffeeType selectedCoffee = null;
        switch (choiceNum) {
            case 1:
                selectedCoffee = new CoffeeType("Americano");
                break;
            case 2:
                selectedCoffee = new CoffeeType("Cappuccino");
                break;
                case 3:
                selectedCoffee = new CoffeeType("Latte");
                break;
            case 4:
                selectedCoffee = new CoffeeType("Mocha");
                break;
            case 5:
                selectedCoffee = new CoffeeType("Espresso");
                break;
                case 6:
                selectedCoffee = new CoffeeType("Macchiato");
                break;
            case 7:
                selectedCoffee = new CoffeeType("Breve");
                break;
            case 8:
                selectedCoffee = new CoffeeType("Drip Coffee");
                break;
            
            
                default:
                System.out.println("Invalid selection.");
        }
        assertEquals("Espresso", selectedCoffee.getType());
    }



    @Test
    public void testSwitchCase6() {
        int choiceNum = 6;
        CoffeeType selectedCoffee = null;
        switch (choiceNum) {
            case 1:
                selectedCoffee = new CoffeeType("Americano");
                break;
            case 2:
                selectedCoffee = new CoffeeType("Cappuccino");
                break;
                case 3:
                selectedCoffee = new CoffeeType("Latte");
                break;
            case 4:
                selectedCoffee = new CoffeeType("Mocha");
                break;
            case 5:
                selectedCoffee = new CoffeeType("Espresso");
                break;
                case 6:
                selectedCoffee = new CoffeeType("Macchiato");
                break;
            case 7:
                selectedCoffee = new CoffeeType("Breve");
                break;
            case 8:
                selectedCoffee = new CoffeeType("Drip Coffee");
                break;
            
            
                default:
                System.out.println("Invalid selection.");
        }
        assertEquals("Macchiato", selectedCoffee.getType());
    }


    @Test
    public void testSwitchCase7() {
        int choiceNum = 7;
        CoffeeType selectedCoffee = null;
        switch (choiceNum) {
            case 1:
                selectedCoffee = new CoffeeType("Americano");
                break;
            case 2:
                selectedCoffee = new CoffeeType("Cappuccino");
                break;
                case 3:
                selectedCoffee = new CoffeeType("Latte");
                break;
            case 4:
                selectedCoffee = new CoffeeType("Mocha");
                break;
            case 5:
                selectedCoffee = new CoffeeType("Espresso");
                break;
                case 6:
                selectedCoffee = new CoffeeType("Macchiato");
                break;
            case 7:
                selectedCoffee = new CoffeeType("Breve");
                break;
            case 8:
                selectedCoffee = new CoffeeType("Drip Coffee");
                break;
            
            
                default:
                System.out.println("Invalid selection.");
        }
        assertEquals("Breve", selectedCoffee.getType());
    }



    @Test
    public void testSwitchCase8() {
        int choiceNum = 8;
        CoffeeType selectedCoffee = null;
        switch (choiceNum) {
            case 1:
                selectedCoffee = new CoffeeType("Americano");
                break;
            case 2:
                selectedCoffee = new CoffeeType("Cappuccino");
                break;
                case 3:
                selectedCoffee = new CoffeeType("Latte");
                break;
            case 4:
                selectedCoffee = new CoffeeType("Mocha");
                break;
            case 5:
                selectedCoffee = new CoffeeType("Espresso");
                break;
                case 6:
                selectedCoffee = new CoffeeType("Macchiato");
                break;
            case 7:
                selectedCoffee = new CoffeeType("Breve");
                break;
            case 8:
                selectedCoffee = new CoffeeType("Drip Coffee");
                break;
            
            
                default:
                System.out.println("Invalid selection.");
        }
        assertEquals("Drip Coffee", selectedCoffee.getType());
    }



   


}
