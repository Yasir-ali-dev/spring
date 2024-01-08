package com.datajpa.spring.datajpa.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "products",
        schema = "ecommerce",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "unique_sku",
                        columnNames = "stock_keeping_unit"
                )
        }

)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    @Column(nullable = false)
    private String name;

    @Column(name = "stock_keeping_unit",nullable = false)
    private String sku;

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequence_generator")
    @SequenceGenerator(name = "sequence_generator", sequenceName = "product_sequence_name", allocationSize = 1)
    private Long id;

    private String description;

    private BigDecimal price;

    private Boolean active;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime dateCreated;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime lastUpdated;

}
