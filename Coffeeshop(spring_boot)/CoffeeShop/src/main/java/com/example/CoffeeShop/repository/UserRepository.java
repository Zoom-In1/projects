package com.example.CoffeeShop.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CoffeeShop.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
	
	Optional<User> findById (String id);
	

}
