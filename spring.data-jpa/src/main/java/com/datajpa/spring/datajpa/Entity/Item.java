package com.datajpa.spring.datajpa.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "items")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Item {
    @Id
    private String itemId ;
    private String name;

    @ManyToMany(mappedBy = "items",fetch = FetchType.LAZY)
    private List <Category> categories;
}
