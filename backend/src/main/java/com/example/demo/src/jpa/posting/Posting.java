package com.example.demo.src.jpa.posting;

import com.example.demo.src.jpa.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Posting extends CommonEntity {
    @SequenceGenerator(name = "posting_sequence_generator", sequenceName = "posting_sequence", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "posting_sequence_generator")
    @Id
    private Long id;

    public Posting() {
        super();
    }
}
