package com.datajpa.spring.datajpa.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "classes")
@Setter
@Getter
@NoArgsConstructor
public class ClassO {
    @Id
    @Column(name = "class_id", nullable = false,unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  classId;

    @Column(name = "class_name")
    private String className;

    @OneToMany (mappedBy = "aClassO", cascade = CascadeType.ALL)
    private List<Student> students;

}
