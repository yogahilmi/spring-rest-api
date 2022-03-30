package com.tasanah.springrest.models.repository;

import java.util.List;

import com.tasanah.springrest.models.entities.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
    
    List<Product> findByNameContains(String name);
}
