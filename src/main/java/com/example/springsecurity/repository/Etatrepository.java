package com.example.springsecurity.repository;

import com.example.springsecurity.model.Etat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Etatrepository extends JpaRepository<Etat,Integer> {
}
