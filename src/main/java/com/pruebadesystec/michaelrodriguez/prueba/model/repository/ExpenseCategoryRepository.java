package com.pruebadesystec.michaelrodriguez.prueba.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebadesystec.michaelrodriguez.prueba.model.entity.ExpenseCategory;

@Repository
public interface ExpenseCategoryRepository extends JpaRepository<ExpenseCategory, Long> {

}
