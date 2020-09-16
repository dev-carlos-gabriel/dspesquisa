package com.devsupeior.pesquisa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsupeior.pesquisa.dto.GameDTO;
import com.devsupeior.pesquisa.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameResource {

	@Autowired
	GameService gameService;

	@GetMapping
	public ResponseEntity<List<GameDTO>> findAll() {
		List<GameDTO> lstGameDTO = gameService.findAll();
		return ResponseEntity.ok().body(lstGameDTO);
	}

}
