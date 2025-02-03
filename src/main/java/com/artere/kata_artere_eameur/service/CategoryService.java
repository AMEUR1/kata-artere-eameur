package com.artere.kata_artere_eameur.service;

import com.artere.kata_artere_eameur.dao.CategoryRepository;
import com.artere.kata_artere_eameur.dao.ProductRepository;
import com.artere.kata_artere_eameur.model.Category;
import com.artere.kata_artere_eameur.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductService productService;

    public Category getCategoryById(Long id){
        return categoryRepository.findById(id).orElse(null);
    }

    public Category addCategory(Category category){
       return categoryRepository.add(category);
    }

    public Long deleteCategory(Long id){
        return categoryRepository.delete(id);
    }

    public Category addProductToCategory(Long categoryId, Long productId){
        Category category = this.getCategoryById(categoryId);
        Product product = productService.getProductById(productId);

        if(category != null && product != null){
            List<Product> products = category.getProducts();
            products.add(product);
            product.setCategory(category);
        }
        return category;
    }

    public Category removeProductFromCategory(Long categoryId, Long productId){
        Category category = this.getCategoryById(categoryId);
        Product product = productService.getProductById(productId);


        if(category != null && product != null){
            List<Product> products = category.getProducts();
            products.remove(product);
            products.removeIf(p -> p.getId().equals(productId));

            product.setCategory(null);
        }
        return category;
    }

}
