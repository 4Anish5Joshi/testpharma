package com.pharmatest.pharma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharmatest.pharma.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

}
