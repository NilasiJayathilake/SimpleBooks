package com.example.notsosimpleshopping;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    ProductEntity findByName(String name);
   List<ProductEntity> findAllByPriceIsLessThanOrderByPriceAsc(double price);
   List<ProductEntity> findAllByQuantityGreaterThan(int quantity);



}
