import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D3m04k4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<BaseCoffee> orders = new ArrayList<>();

        System.out.println("--- Serikov's Coffee Shop ---");

        boolean ordering = true;
        while (ordering) {
            int choice = displayMainMenu(scanner);

            switch (choice) {
                case 1:
                    addCoffeeOrder(orders, new Espresso());
                    break;
                case 2:
                    addCoffeeOrder(orders, new Latte());
                    break;
                case 3:
                    addCoffeeOrder(orders, new Cappuccino());
                    break;
                case 4:
                    addCoffeeOrder(orders, new Americano());
                    break;
                case 5:
                    addCoffeeOrder(orders, new Mocha());
                    break;
                case 6:
                    displayOrders(orders);
                    break;
                case 7:
                    makePurchase(orders);
                    break;
                case 8:
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static int displayMainMenu(Scanner scanner) {
        System.out.println("\nSelect a coffee type:");
        System.out.println("1. Espresso");
        System.out.println("2. Latte");
        System.out.println("3. Cappuccino");
        System.out.println("4. Americano");
        System.out.println("5. Mocha");
        System.out.println("6. My Orders");
        System.out.println("7. Make a Purchase");
        System.out.println("8. Finish Ordering");
        return scanner.nextInt();
    }

    private static void addCoffeeOrder(List<BaseCoffee> orders, BaseCoffee coffee) {
        Scanner scanner = new Scanner(System.in);
        orders.add(coffee);
        System.out.println("Added " + coffee.getDescription() + " to your order.");

        while (true) {
            System.out.println("Do you want to add any condiments?");
            System.out.println("1. Milk");
            System.out.println("2. Sugar");
            System.out.println("3. Cream");
            System.out.println("4. No, I'm done.");
            int condimentChoice = scanner.nextInt();

            if (condimentChoice == 4) {
                break;
            }

            for (int i = 0; i < orders.size(); i++) {
                BaseCoffee order = orders.get(i);
                switch (condimentChoice) {
                    case 1:
                        order = new Milk(order);
                        System.out.println("Added Milk to your order.");
                        break;
                    case 2:
                        order = new Sugar(order);
                        System.out.println("Added Sugar to your order.");
                        break;
                    case 3:
                        order = new Cream(order);
                        System.out.println("Added Cream to your order.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
                orders.set(i, order); // Update the orders list with the decorated order
            }
        }
    }




    private static void displayOrders(List<BaseCoffee> orders) {
        if (orders.isEmpty()) {
            System.out.println("You have no orders yet.");
            return;
        }

        System.out.println("\nYour Orders:");
        for (int i = 0; i < orders.size(); i++) {
            System.out.println((i + 1) + ". " + orders.get(i).getDescription() + " - Cost: $" + orders.get(i).cost());
        }
    }

    private static void makePurchase(List<BaseCoffee> orders) {
        double sum = 0;
        for (BaseCoffee coffee : orders) {
            sum += coffee.cost();
        }
        System.out.println("Cost of order - " + sum + ". Thanks for purchase!");
    }
}
