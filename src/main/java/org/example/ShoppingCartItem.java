package org.example;

class ShoppingCartItem<T> {
    private String name;
    private T item;
    private double price;

    public ShoppingCartItem(String name, T item, double price) {
        this.name = name;
        this.item = item;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public T getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }
}



