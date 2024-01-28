package com.example.springsecurity.repository;

import com.example.springsecurity.model.Statistique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Statistiquerepo extends JpaRepository<Statistique,String> {
    @Query(nativeQuery = true, value = "SELECT * FROM statistique")
    List<Statistique> findstat();
}
