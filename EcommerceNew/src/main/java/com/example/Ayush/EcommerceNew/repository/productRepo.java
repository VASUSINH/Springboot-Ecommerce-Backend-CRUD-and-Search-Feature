package com.example.Ayush.EcommerceNew.repository;

import com.example.Ayush.EcommerceNew.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface productRepo extends JpaRepository<Product,Integer> {
        @Query("SELECT p from Product p WHERE " +
                "LOWER(p.name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
                "LOWER(p.desc) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
                "LOWER(p.brand) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
                "LOWER(p.category) LIKE LOWER(CONCAT('%', :keyword, '%'))")
        List<Product> searchProducts(String keyword);


}