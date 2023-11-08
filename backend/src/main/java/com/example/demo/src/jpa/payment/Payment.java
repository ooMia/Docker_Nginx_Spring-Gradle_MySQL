package com.example.demo.src.jpa.payment;

import com.example.demo.src.jpa.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Payment extends CommonEntity {
    @SequenceGenerator(name = "payment_sequence_generator", sequenceName = "payment_sequence", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "payment_sequence_generator")
    @Id
    private Long id;

    public Payment() {
        super();
    }
}
