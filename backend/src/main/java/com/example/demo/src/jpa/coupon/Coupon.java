package com.example.demo.src.jpa.coupon;

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
import java.time.LocalDateTime;

@Entity
@Table
public class Coupon extends CommonEntity {
    @SequenceGenerator(name = "coupon_sequence_generator", sequenceName = "coupon_sequence", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "coupon_sequence_generator")
    @Id
    private Long id;
    private LocalDateTime expiredAt;
    private Boolean isUsed;
    private Long requirement;
    private Long discount;
    @ManyToOne
    private Buyer buyer;
    @ManyToOne
    private ProductDetail productDetail;

    public Coupon() {
        super();
    }
}
