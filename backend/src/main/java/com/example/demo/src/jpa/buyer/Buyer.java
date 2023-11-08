package com.example.demo.src.jpa.buyer;

import com.example.demo.src.jpa.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Buyer extends CommonEntity {
    @SequenceGenerator(name = "buyer_sequence_generator", sequenceName = "buyer_sequence", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "buyer_sequence_generator")
    @Id
    private Long id;
    private String name;
    private String concat;
    private String address;

    public Buyer() {
        super();
    }
}
