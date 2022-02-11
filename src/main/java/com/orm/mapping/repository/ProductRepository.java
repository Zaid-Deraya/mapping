package com.orm.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orm.mapping.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
