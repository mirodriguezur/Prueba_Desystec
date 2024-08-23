package com.pruebadesystec.michaelrodriguez.prueba.model.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebadesystec.michaelrodriguez.prueba.model.entity.Purchase;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
    List<Purchase> findByDateBetween(LocalDate startDate, LocalDate endDate);
}
