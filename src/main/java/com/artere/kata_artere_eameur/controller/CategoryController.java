package com.artere.kata_artere_eameur.controller;

import com.artere.kata_artere_eameur.model.Category;
import com.artere.kata_artere_eameur.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Long id){
        return categoryService.getCategoryById(id);
    }

    @PostMapping
    public Category addCategory(@RequestBody Category category){
        return categoryService.addCategory(category);
    }

    @DeleteMapping("/{id}")
    public Long deleteCategoryById(@PathVariable Long id){
        return categoryService.deleteCategory(id);
    }

    @PostMapping("/{categoryId}/products/{productId}")
    public Category addProductToCategory(@PathVariable Long categoryId, @PathVariable Long productId) {
        return categoryService.addProductToCategory(categoryId, productId);
    }

    @DeleteMapping("/{categoryId}/products/{productId}")
    public Category removeProductFromCategory(@PathVariable Long categoryId, @PathVariable Long productId) {
        return categoryService.removeProductFromCategory(categoryId, productId);
    }

}
