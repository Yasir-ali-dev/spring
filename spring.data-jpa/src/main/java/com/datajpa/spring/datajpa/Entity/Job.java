package com.datajpa.spring.datajpa.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "jobs")
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jobId;
    private String name;

    @OneToOne(mappedBy = "job", cascade = CascadeType.ALL)
    private Employee employee;
}
