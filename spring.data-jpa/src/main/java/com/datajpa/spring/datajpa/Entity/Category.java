package com.datajpa.spring.datajpa.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "categories")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Category {
    @Id
    private String category_id;

    @Column(name="category_name")
    private String name;

    @ManyToMany
    private List <Item> items;

}
