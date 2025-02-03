package com.artere.kata_artere_eameur.dao;

import com.artere.kata_artere_eameur.model.Category;
import com.artere.kata_artere_eameur.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CategoryRepository {

    @Autowired
    ProductRepository productRepository;

    // in memory categories
    private final List<Category> categories = new ArrayList<>();

    private Long nextId = 1L;

    public Category add(Category category){
        if(category != null){
            category.setId(nextId++);
            categories.add(category);
        }
        return category;
    }

    public Long delete(Long id){
        categories.removeIf(c -> c.getId().equals(id));

        List<Product> products = productRepository.findAll();

        products.forEach(product -> {
            if (product.getCategory() != null && product.getCategory().getId().equals(id)) {
                product.setCategory(null);
            }
        });


        return id;
    }

    public Optional<Category> findById(Long id){
        return categories.stream().filter(c -> c.getId().equals(id)).findFirst();
    }

}
