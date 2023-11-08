package com.example.demo.src.jpa.orderdetail;

import com.example.demo.src.jpa.CommonEntity;
import com.example.demo.src.jpa.delivery.Delivery;
import com.example.demo.src.jpa.productdetail.ProductDetail;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class OrderDetail extends CommonEntity {
    @SequenceGenerator(name = "orderDetail_sequence_generator", sequenceName = "orderDetail_sequence", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orderDetail_sequence_generator")
    @Id
    private Long id;
    private Long unitPrice;
    private Long quantity;
    private Long discount;
    private Long price;
    private String status;
    @OneToOne
    private ProductDetail productDetail;
    @OneToOne
    private Delivery delivery;

    public OrderDetail() {
        super();
    }
}
