package com.artere.kata_artere_eameur.service;

import com.artere.kata_artere_eameur.dao.ProductRepository;
import com.artere.kata_artere_eameur.model.Product;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product getProductById(Long id){
        return productRepository.findById(id).orElse(null);
    }

    public Product addProduct(Product product){
        return productRepository.add(product);
    }

    public Long deleteProduct(Long id){
        return productRepository.delete(id);
    }

}
