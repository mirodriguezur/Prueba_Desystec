package com.pruebadesystec.michaelrodriguez.prueba.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebadesystec.michaelrodriguez.prueba.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
