package com.devsupeior.pesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsupeior.pesquisa.RecordDTO;
import com.devsupeior.pesquisa.RecordInsertDTO;
import com.devsupeior.pesquisa.entities.Game;
import com.devsupeior.pesquisa.entities.Record;
import com.devsupeior.pesquisa.repositories.GameRepository;
import com.devsupeior.pesquisa.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	RecordRepository recordRepository;

	@Autowired
	GameRepository gameRepository;

	@Transactional(readOnly = true)
	public RecordDTO insert(RecordInsertDTO dto) {

		Record record = new Record();

		record.setName(dto.getName());
		record.setAge(dto.getAge());
		record.setMoment(Instant.now());
		Game game = gameRepository.getOne(dto.getGameId());
		record.setGame(game);

		record = recordRepository.save(record);

		return new RecordDTO(record);
	}
}
