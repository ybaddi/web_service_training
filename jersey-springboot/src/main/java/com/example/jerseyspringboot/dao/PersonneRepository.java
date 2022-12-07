package com.example.jerseyspringboot.dao;

import com.example.jerseyspringboot.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonneRepository extends JpaRepository<Personne, Long> {

    public List<Personne> findByNom(String nom);
}
