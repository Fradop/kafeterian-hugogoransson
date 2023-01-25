package kafeterian;

import java.util.Scanner;
import java.util.ArrayList;

class CoffeeTypes {
    private String type;
    private boolean extraMilk;
    private boolean extraSugar;
    private Scanner scanner = new Scanner(System.in);

    public CoffeeTypes(String type) {
        this.type = type;
    }

    public void setExtraMilk() {
        System.out.println("Would you like extra milk? (y/n)");
        String choice = scanner.nextLine();
        this.extraMilk = choice.equalsIgnoreCase("y");
    }

    public boolean getExtraMilk() {
        return extraMilk;
    }

    public void setExtraSugar() {
        System.out.println("Would you like extra sugar? (y/n)");
        String choice = scanner.nextLine();
        this.extraSugar = choice.equalsIgnoreCase("y");
    }

    public boolean getExtraSugar() {
        return extraSugar;
    }

    public String getType() {
        return type;
    }

    public static void main(String[] args) {
        CoffeeTypes americano = new CoffeeTypes("Americano");
        CoffeeTypes cappuccino = new CoffeeTypes("Cappuccino");
        CoffeeTypes latte = new CoffeeTypes("Latte");
        CoffeeTypes mocha = new CoffeeTypes("Mocha");
        CoffeeTypes espresso = new CoffeeTypes("Espresso");
        CoffeeTypes macchiato = new CoffeeTypes("Macchiato");
        CoffeeTypes breve = new CoffeeTypes("Breve");
        CoffeeTypes dripCoffee = new CoffeeTypes("Drip Coffee");
        ArrayList<CoffeeTypes> orders = new ArrayList<>();
    
        Scanner scanner = new Scanner(System.in);
        boolean continueOrdering = true;
    
        while (continueOrdering) {
            System.out.println("Select a coffee:");
            System.out.println("1. Americano");
            System.out.println("2. Cappuccino");
            System.out.println("3. Latte");
            System.out.println("4. Mocha");
            System.out.println("5. Espresso");
            System.out.println("6. Macchiato");
            System.out.println("7. Breve");
            System.out.println("8. Drip Coffee");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // consume the newline character
            CoffeeTypes selectedCoffee = null;

        switch (choice) {
            case 1:
                selectedCoffee = americano;
                break;
            case 2:
                selectedCoffee = cappuccino;
                break;
            case 3:
                selectedCoffee = latte;
                break;
            case 4:
                selectedCoffee = mocha;
                break;
            case 5:
                selectedCoffee = espresso;
                break;
            case 6:
                selectedCoffee = macchiato;
                break;
            case 7:
                selectedCoffee = breve;
                break;
            case 8:
                selectedCoffee = dripCoffee;
                break;
            case 9:
                continueOrdering = false;
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                continue;
        }

        if (!continueOrdering || selectedCoffee == null) {
            break;
        }

        System.out.println("You selected a " + selectedCoffee.getType() + ".");
        if (selectedCoffee.getType().equals("Americano") || selectedCoffee.getType().equals("Mocha") || selectedCoffee.getType().equals("Macchiato") || selectedCoffee.getType().equals("Drip Coffee")) {
            System.out.println("Would you like extra milk? (y/n)");
            String extraMilkChoice = scanner.nextLine();
            selectedCoffee.extraMilk = extraMilkChoice.equalsIgnoreCase("y");

            System.out.println("Would you like extra sugar? (y/n)");
            String extraSugarChoice = scanner.nextLine();
            selectedCoffee.extraSugar = extraSugarChoice.equalsIgnoreCase("y");
        }

        System.out.println("Your " + selectedCoffee.getType() + " with " + (selectedCoffee.extraMilk ? "extra milk " : "") + (selectedCoffee.extraSugar ? "extra sugar." : ""));
        orders.add(selectedCoffee);
    }
    System.out.println("Thank you for ordering!");
    System.out.println("Orders:");
    for(CoffeeTypes order: orders){
        System.out.println(order.getType() + " with " + (order.extraMilk ? "extra milk " : "") + (order.extraSugar ? "extra sugar." : ""));
    }
}
}
