package com.pruebadesystec.michaelrodriguez.prueba.model.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "expenseCategory", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonBackReference
    private List<Purchase> purchases;
}
