package com.datajpa.spring.datajpa.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int studentId;
    private String name;
    private String about;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Laptop laptop;

    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Address> addressList;

}
