package com.tasanah.springrest.services;

import java.util.Optional;

import javax.transaction.TransactionScoped;

import com.tasanah.springrest.models.entities.Category;
import com.tasanah.springrest.models.repository.CategoryRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@TransactionScoped
public class CategoryService {
    
    @Autowired
    private CategoryRepo categoryRepo;

    public Category save(Category category) {
        return categoryRepo.save(category);
    }

    public Category findOne(Long id) {
        Optional<Category> category = categoryRepo.findById(id);
        if (!category.isPresent()) {
            return null;
        }
        return category.get();
    }

    public Iterable<Category> findAll() {
        return categoryRepo.findAll();
    }

    public void removeOne(Long id) {
        categoryRepo.deleteById(id);
    }

    public Iterable<Category> findByName(String name, Pageable pageable) {
        return categoryRepo.findByNameContains(name, pageable);
    }

    public Iterable<Category> saveBatch(Iterable<Category> categories) {
        return categoryRepo.saveAll(categories);
    }
}
