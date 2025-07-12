package com.example.DataOperations.repository;

import com.example.DataOperations.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetails, Long> {}