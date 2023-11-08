package com.example.demo.src.jpa;

import jakarta.persistence.Transient;
import java.time.LocalDate;
import java.time.Period;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

public class CommonEntity {
    @Transient
    @CreationTimestamp
    private LocalDate createdAt;

    @Transient
    @UpdateTimestamp
    private LocalDate updatedAt;

    public CommonEntity() {
    }

    public int getDayPassedFromCreate() {
        return Period.between(createdAt, LocalDate.now()).getDays();
    }
    public int getDayPassedFromUpdate() {
        return Period.between(updatedAt, LocalDate.now()).getDays();
    }
}
