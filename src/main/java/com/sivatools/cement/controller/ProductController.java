package com.sivatools.cement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sivatools.cement.model.Product;
import com.sivatools.cement.repository.ProductRepository;


@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
    ProductRepository productRepository;
	
	 @GetMapping("/products")
	    public List<Product> getAllNotes() {
	        return productRepository.findAll();
	    }

}
