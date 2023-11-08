package com.example.demo.src.jpa.order;

import com.example.demo.src.jpa.CommonEntity;
import com.example.demo.src.jpa.buyer.Buyer;
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
public class Order extends CommonEntity {
    @SequenceGenerator(name = "order_sequence_generator", sequenceName = "order_sequence", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_sequence_generator")
    @Id
    private Long id;
    private String receiverName;
    private String receiverContact;
    private String receiverAddress;
    private String receiverRequirement;
    @ManyToOne
    private Buyer buyer;

    public Order() {
        super();
    }
}
