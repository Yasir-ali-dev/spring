package com.hibernate.crud.DAO;


import com.hibernate.crud.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public Student findById (Integer id){
        return entityManager.find(Student.class,id);
    }


    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query= entityManager.createQuery("FROM Student",Student.class);
        List<Student> students = query.getResultList();
        return  students;

    }

    @Override
    public Student findLike() {
       TypedQuery <Student> query= entityManager.createQuery("FROM Student WHERE email LIKE '%yahoo.com'", Student.class);
       Student student= query.getSingleResult();
       return student;
    }

    @Override
    public List <Student> findByLastName(String Name ) {
        TypedQuery<Student> query = entityManager.createQuery("FROM Student WHERE firstName=:theParameter", Student.class);
        query.setParameter("theParameter",Name);
        List <Student> students = query.getResultList();
        return students;

    }
}


