package com.datajpa.spring.datajpa.Repository;

import com.datajpa.spring.datajpa.Entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    void save(){
        Product newProduct = new Product();
        newProduct.setName("Addidas Shoes");
        newProduct.setActive(true);
        newProduct.setPrice(new BigDecimal(1100));
        newProduct.setDescription("product Addidas description ");
        newProduct.setSku("AAS Product");

        Product product=productRepository.save(newProduct);

        System.out.println(product.getId());
        System.out.println(product.toString());
    }

    @Test
    void update(){
        Product product=productRepository.findById(3L).get();

//        product.setName("Zebra updated");
//        product.setDescription("updated zebra description");
        product.setPrice(new BigDecimal(120));
        Product updatedProduct = productRepository.save(product);
        System.out.println(product.getId());
        System.out.println(product.toString());
    }

    @Test
    void findOne (){
        Product  product= productRepository.findById(1L).get();
        System.out.println(product.toString());
    }

    @Test
    void existed(){
        Boolean isExisted = productRepository.existsById(3L);
        System.out.println(isExisted);
    }

    @Test
    void saveAll(){
        Product product4 = new Product();
        product4.setPrice(new BigDecimal(122));
        product4.setActive(false);
        product4.setSku("DDS");
        product4.setName("Shirt Rd");
        product4.setDescription("shirt description ");


        Product product5 = new Product();
        product4.setPrice(new BigDecimal(130));
        product4.setActive(false);
        product4.setSku("DDL");
        product4.setName("Shirt HOT");
        product4.setDescription("shirt HOT description ");

        List products =  productRepository.saveAll(List.of(product4,product5));
        System.out.println(products);

    }

    @Test
    void findAll(){
        List products = productRepository.findAll();
        System.out.println(products);
    }

    @Test
    void findAllById(){
        List products = productRepository.findAllById(List.of(1L,4L));
        products.forEach((r)->{
            System.out.println(r);
        });
    }

    @Test
    void countProducts(){
        Long count = productRepository.count();
        System.out.println(count);
    }

    @Test
    void deleteById(){
        productRepository.deleteById(4L);
    }

    @Test
    void delete(){
        Product product = productRepository.findById(1L).get();
        productRepository.delete(product);
    }

    @Test
    void deleteAll(){
        productRepository.deleteAll();
        //deletes all the entities from the repository
    }

    @Test
    void deleteAllWithList (){
        Product pro = productRepository.findById(5L).get();
        productRepository.deleteAll(List.of(pro));
    }







}