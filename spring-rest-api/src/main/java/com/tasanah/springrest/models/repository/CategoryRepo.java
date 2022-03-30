package com.tasanah.springrest.models.repository;

import com.tasanah.springrest.models.entities.Category;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Long>{
    
}
