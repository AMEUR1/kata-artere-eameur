package com.artere.kata_artere_eameur.service;

import com.artere.kata_artere_eameur.dao.CategoryRepository;
import com.artere.kata_artere_eameur.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category getCategoryById(Long id){
        return categoryRepository.findById(id).orElse(null);
    }

    public Category addCategory(Category category){
       return categoryRepository.add(category);
    }

    public Long deleteCategory(Long id){
        return categoryRepository.delete(id);
    }

}
