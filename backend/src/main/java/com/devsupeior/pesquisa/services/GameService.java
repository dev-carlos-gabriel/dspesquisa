package com.devsupeior.pesquisa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsupeior.pesquisa.dto.GameDTO;
import com.devsupeior.pesquisa.entities.Game;
import com.devsupeior.pesquisa.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	GameRepository gameRepository;

	@Transactional(readOnly = true)
	public List<GameDTO> findAll() {
		List<Game> lstGame = gameRepository.findAll();
		return lstGame.stream().map(game -> new GameDTO(game)).collect(Collectors.toList());
	}

}
