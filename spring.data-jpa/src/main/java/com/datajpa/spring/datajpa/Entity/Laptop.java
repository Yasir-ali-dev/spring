package com.datajpa.spring.datajpa.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Table(name = "laptops")
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int laptopId;
    private String model;
    private String brand;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;



}
