package com.example.demo.src.jpa.comment;

import com.example.demo.src.jpa.CommonEntity;
import com.example.demo.src.jpa.buyer.Buyer;
import com.example.demo.src.jpa.productdetail.ProductDetail;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Comment extends CommonEntity {
    @SequenceGenerator(name = "comment_sequence_generator", sequenceName = "comment_sequence", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_sequence_generator")
    @Id
    private Long id;
    private Long rating;
    private String detail;
    @ManyToOne
    private ProductDetail productDetail;
    @ManyToOne
    private Buyer buyer;

    public Comment() {
        super();
    }
}
