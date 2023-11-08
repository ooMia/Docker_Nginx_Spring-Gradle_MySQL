package com.example.demo.src.jpa.delivery;

import com.example.demo.src.jpa.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Delivery extends CommonEntity {
    @SequenceGenerator(name = "delivery_sequence_generator", sequenceName = "delivery_sequence", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "delivery_sequence_generator")
    @Id
    private Long id;

    public Delivery() {
        super();
    }
}
