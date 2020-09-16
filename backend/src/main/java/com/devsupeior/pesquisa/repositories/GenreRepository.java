package com.devsupeior.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsupeior.pesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
