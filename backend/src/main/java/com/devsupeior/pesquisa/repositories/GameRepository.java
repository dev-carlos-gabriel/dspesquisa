package com.devsupeior.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsupeior.pesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
