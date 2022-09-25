package com.sivatools.cement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sivatools.cement.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
