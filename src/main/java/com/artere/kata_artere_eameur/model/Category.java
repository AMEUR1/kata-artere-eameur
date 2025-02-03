package com.artere.kata_artere_eameur.model;

import java.util.List;

public class Category {

    private Long id;
    private String name;
    private String Description;
    private Category parentCategory;
    private List<Category> subCategories;
    private List<Object> products;


    public Category(Long id, String name, String description, Category parentCategory, List<Category> subCategories, List<Object> products) {
        this.id = id;
        this.name = name;
        Description = description;
        this.parentCategory = parentCategory;
        this.subCategories = subCategories;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return Description;
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public List<Category> getSubCategories() {
        return subCategories;
    }

    public List<Object> getProducts() {
        return products;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public void setSubCategories(List<Category> subCategories) {
        this.subCategories = subCategories;
    }

    public void setProducts(List<Object> products) {
        this.products = products;
    }
}
