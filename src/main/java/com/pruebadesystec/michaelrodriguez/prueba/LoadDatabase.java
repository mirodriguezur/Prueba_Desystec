package com.pruebadesystec.michaelrodriguez.prueba;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pruebadesystec.michaelrodriguez.prueba.model.entity.ExpenseCategory;
import com.pruebadesystec.michaelrodriguez.prueba.model.entity.Purchase;
import com.pruebadesystec.michaelrodriguez.prueba.model.entity.User;
import com.pruebadesystec.michaelrodriguez.prueba.model.repository.ExpenseCategoryRepository;
import com.pruebadesystec.michaelrodriguez.prueba.model.repository.PurchaseRepository;
import com.pruebadesystec.michaelrodriguez.prueba.model.repository.UserRepository;

@Configuration
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository, ExpenseCategoryRepository expenseCategoryRepository,
            PurchaseRepository purchaseRepository) {
        return args -> {
            // Create users
            User user1 = new User();
            User user2 = new User();
            user1.setName("Inmobiliaria A");
            user1.setEmail("inmobiliariaa@test.com");
            user1.setAddress("Cl 1 No 2 - 3");
            user2.setName("Inmobiliaria B");
            user2.setEmail("inmobiliariab@test.com");
            user2.setAddress("Cr 5 No 15 - 3");
            userRepository.save(user1);
            userRepository.save(user2);

            // Create categories
            ExpenseCategory category1 = new ExpenseCategory();
            ExpenseCategory category2 = new ExpenseCategory();
            category1.setName("Administrative");
            category2.setName("Insurance");
            expenseCategoryRepository.save(category1);
            expenseCategoryRepository.save(category2);

            // Create Purchases
            Purchase purchase1 = new Purchase();
            Purchase purchase2 = new Purchase();
            purchase1.setDescription("Payment to suppliers");
            purchase1.setAmount(20000000.0);
            purchase1.setDate(LocalDate.now());
            purchase1.setUser(user1);
            purchase1.setExpenseCategory(category1);
            purchase2.setDescription("managed property insurance");
            purchase2.setAmount(10000000.0);
            purchase2.setDate(LocalDate.now());
            purchase2.setUser(user2);
            purchase2.setExpenseCategory(category2);
            purchaseRepository.save(purchase1);
            purchaseRepository.save(purchase2);
        };
    }
}
