package com.artere.kata_artere_eameur.controller;

import com.artere.kata_artere_eameur.model.Product;
import com.artere.kata_artere_eameur.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @DeleteMapping("/{id}")
    public Long deleteProductById(@PathVariable Long id){
        return productService.deleteProduct(id);
    }


}
