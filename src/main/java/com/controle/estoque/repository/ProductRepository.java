package com.controle.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.controle.estoque.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
