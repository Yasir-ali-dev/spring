package com.hibernate.crud.DAO;

import com.hibernate.crud.Entity.Student;

import java.util.List;

public interface StudentDAO {
    void save (Student student);

    Student findById (Integer id);

    List<Student> findAll();

    Student findLike();

    List<Student> findByLastName(String name );


}
