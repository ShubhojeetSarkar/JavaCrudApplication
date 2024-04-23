package com.shubhojeet.beststore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shubhojeet.beststore.models.Product;

public interface ProductsRepository extends JpaRepository<Product,Integer>{

}
