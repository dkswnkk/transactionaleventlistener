package com.example.transactionaleventlistener.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@NoArgsConstructor(access = PROTECTED)
public class Example {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String currentValue;

    private String beforeValue;

    public void updateCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }

    public void updateBeforeValue(String beforeValue) {
        this.beforeValue = beforeValue;
    }
}
