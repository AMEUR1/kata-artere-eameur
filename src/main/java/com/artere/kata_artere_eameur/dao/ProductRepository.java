package com.artere.kata_artere_eameur.dao;

import com.artere.kata_artere_eameur.model.Category;
import com.artere.kata_artere_eameur.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepository {

    // in memory products
    private final List<Product> products = new ArrayList<>();

    private Long nextId = 1L;

    public Product add(Product product){
        if(product != null){
            product.setId(nextId++);
            products.add(product);
        }

        return product;
    }

    public Long delete(Long id){
        // to do
        return id;
    }

    public Optional<Product> findById(Long id){
        return products.stream().filter(c -> c.getId().equals(id)).findFirst();
    }

}
