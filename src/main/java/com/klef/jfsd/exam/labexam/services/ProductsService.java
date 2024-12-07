package com.klef.jfsd.exam.labexam.services;

import com.klef.jfsd.exam.labexam.models.Products;
import com.klef.jfsd.exam.labexam.repositories.ProductsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    // Method to fetch all products
    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }
}
