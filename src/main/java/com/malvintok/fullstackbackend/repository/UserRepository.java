package com.malvintok.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.malvintok.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {}
