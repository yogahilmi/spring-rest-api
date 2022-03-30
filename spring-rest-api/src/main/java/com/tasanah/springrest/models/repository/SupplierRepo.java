package com.tasanah.springrest.models.repository;

import com.tasanah.springrest.models.entities.Supplier;

import org.springframework.data.repository.CrudRepository;

public interface SupplierRepo extends CrudRepository<Supplier, Long>{
    
}
