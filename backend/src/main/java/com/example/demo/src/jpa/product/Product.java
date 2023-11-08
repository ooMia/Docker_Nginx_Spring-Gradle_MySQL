package com.example.demo.src.jpa.product;

import com.example.demo.src.jpa.CommonEntity;
import com.example.demo.src.jpa.category.Category;
import com.example.demo.src.jpa.posting.Posting;
import com.example.demo.src.jpa.seller.Seller;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Product extends CommonEntity {
    @SequenceGenerator(name = "product_sequence_generator", sequenceName = "product_sequence", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_sequence_generator")
    @Id
    private Long id;
    private String name;
    @ManyToOne
    private Seller seller;
    @OneToOne
    private Category category;
    @ManyToOne
    private Posting posting;

    public Product() {
        super();
    }
}
