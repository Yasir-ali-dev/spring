package com.datajpa.spring.datajpa.Repository;

import com.datajpa.spring.datajpa.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
