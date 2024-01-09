package com.datajpa.spring.datajpa.Repository;

import com.datajpa.spring.datajpa.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
