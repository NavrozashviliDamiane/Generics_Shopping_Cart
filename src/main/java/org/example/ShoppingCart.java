package org.example;
import java.util.ArrayList;
import java.util.List;

class ShoppingCart<T> {
    private List<ShoppingCartItem<T>> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addItem(String name, T item, double price) {
        ShoppingCartItem<T> cartItem = new ShoppingCartItem<>(name, item, price);
        cartItems.add(cartItem);
    }

    public double calculateTotal() {
        double total = 0;
        for (ShoppingCartItem<T> cartItem : cartItems) {
            total += cartItem.getPrice();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("Shopping Cart Contents:");
        for (ShoppingCartItem<T> cartItem : cartItems) {
            System.out.println(cartItem.getName() + ": $" + cartItem.getPrice());
        }
    }
}