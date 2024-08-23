package com.pruebadesystec.michaelrodriguez.prueba.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import com.pruebadesystec.michaelrodriguez.prueba.model.entity.Purchase;
import com.pruebadesystec.michaelrodriguez.prueba.model.repository.PurchaseRepository;

@RestController
@RequestMapping("/api/purchases")
public class PurchaseController {
    @Autowired
    private PurchaseRepository purchaseRepository;

    @GetMapping
    public List<Purchase> getAllCompras() {
        return purchaseRepository.findAll();
    }

    @GetMapping("/filter")
    public List<Purchase> getPurchasesByDateRange(
            @RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        return purchaseRepository.findByDateBetween(startDate, endDate);
    }
}
