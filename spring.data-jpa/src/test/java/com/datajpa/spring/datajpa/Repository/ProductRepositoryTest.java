package com.datajpa.spring.datajpa.Repository;

import com.datajpa.spring.datajpa.Entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    void save(){
        Product newProduct = new Product();
        newProduct.setName("Zebra Shoes");
        newProduct.setActive(true);
        newProduct.setPrice(new BigDecimal(100));
        newProduct.setDescription("product zebra description ");
        newProduct.setSku("ABZ Product");

        Product product=productRepository.save(newProduct);

        System.out.println(product.getId());
        System.out.println(product.toString());
    }

    @Test
    void update(){
        Product product=productRepository.findById(1L).get();

        product.setName("Zebra updated");
        product.setDescription("updated zebra description");

        Product updatedProduct = productRepository.save(product);
        System.out.println(product.getId());
        System.out.println(product.toString());
    }

    @Test
    void findOne (){
        Product  product= productRepository.findById(1L).get();

        System.out.println(product.toString());
    }




}