package com.example.demo.src.jpa.seller;

import com.example.demo.src.jpa.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Seller extends CommonEntity {
    @SequenceGenerator(name = "seller_sequence_generator", sequenceName = "seller_sequence", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seller_sequence_generator")
    @Id
    private Long id;
    private String name;
    private String contact;

    public Seller() {
        super();
    }

    public Seller(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }
}
