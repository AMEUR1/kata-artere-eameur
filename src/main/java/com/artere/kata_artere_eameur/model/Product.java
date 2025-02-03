package com.artere.kata_artere_eameur.model;

public class Product {

    private Long id;
    private String name;
    private double price;
    private int inventory;
    private Category category;

    public Product(Long id, String name, double price, int inventory, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inventory = inventory;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
