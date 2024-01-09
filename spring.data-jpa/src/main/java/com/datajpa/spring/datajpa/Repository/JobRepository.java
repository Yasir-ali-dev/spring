package com.datajpa.spring.datajpa.Repository;

import com.datajpa.spring.datajpa.Entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job,Integer> {
}
