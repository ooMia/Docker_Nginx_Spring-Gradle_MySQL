package com.example.demo.src.jpa.category;

import com.example.demo.src.jpa.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Category extends CommonEntity {
    @SequenceGenerator(name = "category_sequence_generator", sequenceName = "category_sequence", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_sequence_generator")
    @Id
    private Long id;
    private String name;
    @OneToOne
    private Category category;

    public Category() {
        super();
    }
}
