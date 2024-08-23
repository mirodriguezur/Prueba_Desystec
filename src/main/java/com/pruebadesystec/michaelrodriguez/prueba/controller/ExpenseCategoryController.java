package com.pruebadesystec.michaelrodriguez.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pruebadesystec.michaelrodriguez.prueba.model.entity.ExpenseCategory;
import com.pruebadesystec.michaelrodriguez.prueba.model.repository.ExpenseCategoryRepository;

@RestController
@RequestMapping("/api/categories")
public class ExpenseCategoryController {
    @Autowired
    private ExpenseCategoryRepository expenseCategoryRepository;

    @GetMapping
    public List<ExpenseCategory> getAllCategories() {
        return expenseCategoryRepository.findAll();
    }

    @PostMapping
    public ExpenseCategory createCategory(@RequestBody ExpenseCategory category) {
        return expenseCategoryRepository.save(category);
    }
}
