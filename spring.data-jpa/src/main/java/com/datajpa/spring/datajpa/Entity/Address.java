package com.datajpa.spring.datajpa.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "addresses")
@Setter
@Getter
@NoArgsConstructor
@ToString

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;

    private String street;
    private String city;

    private String country;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
