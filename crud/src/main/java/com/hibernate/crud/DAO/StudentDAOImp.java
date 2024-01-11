package com.hibernate.crud.DAO;


import com.hibernate.crud.Entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAOImp implements StudentDAO{
    private EntityManager entityManager;

    @Autowired
    StudentDAOImp(EntityManager entityManager){
        this.entityManager=entityManager;
    }
    @Override
    @Transactional
    public void save(Student student){
        entityManager.persist(student);
    }

}

