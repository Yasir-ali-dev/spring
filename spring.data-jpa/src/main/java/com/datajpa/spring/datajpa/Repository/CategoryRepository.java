package com.datajpa.spring.datajpa.Repository;

import com.datajpa.spring.datajpa.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
