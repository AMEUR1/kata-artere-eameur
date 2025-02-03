package com.artere.kata_artere_eameur.dao;

import com.artere.kata_artere_eameur.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
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
        products.removeIf(p -> p.getId().equals(id));
        return id;
    }

    public Optional<Product> findById(Long id){
        return products.stream().filter(c -> c.getId().equals(id)).findFirst();
    }

}
