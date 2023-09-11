package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart<String> stringCart = new ShoppingCart<>();
        ShoppingCart<Integer> intCart = new ShoppingCart<>();

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a String item");
            System.out.println("2. Add an Integer item");
            System.out.println("3. Calculate total price");
            System.out.println("4. Display cart");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter the item description: ");
                    String itemDescription = scanner.nextLine();
                    System.out.print("Enter the item price: ");
                    double itemPrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    stringCart.addItem(itemName, itemDescription, itemPrice);
                    break;
                case 2:
                    System.out.print("Enter the item name: ");
                    String itemNameInt = scanner.nextLine();
                    System.out.print("Enter the item ID: ");
                    int itemID = scanner.nextInt();
                    System.out.print("Enter the item price: ");
                    double itemPriceInt = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    intCart.addItem(itemNameInt, itemID, itemPriceInt);
                    break;
                case 3:
                    double stringTotal = stringCart.calculateTotal();
                    double intTotal = intCart.calculateTotal();
                    System.out.println("Total Price (String Cart): $" + stringTotal);
                    System.out.println("Total Price (Integer Cart): $" + intTotal);
                    break;
                case 4:
                    stringCart.displayCart();
                    intCart.displayCart();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}