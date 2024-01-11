package com.hibernate.crud.DAO;

import com.hibernate.crud.Entity.Student;

public interface StudentDAO {
    void save (Student student);

    Student findById (Integer id);

}
