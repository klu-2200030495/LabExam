package com.klef.jfsd.exam.labexam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.exam.labexam.models.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {
}
