package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Application;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}
