package com.example.demo.src.jpa.productdetail;

import com.example.demo.src.jpa.CommonEntity;
import com.example.demo.src.jpa.product.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class ProductDetail extends CommonEntity {
    @SequenceGenerator(name = "productDetail_sequence_generator", sequenceName = "productDetail_sequence", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productDetail_sequence_generator")
    @Id
    private Long id;
    private String option;
    private Long stock;
    private Long price;
    private Double discountRate;
    @ManyToOne
    private Product product;

    public ProductDetail() {
        super();
    }
}
