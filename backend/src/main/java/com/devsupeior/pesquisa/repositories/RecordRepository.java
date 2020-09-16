package com.devsupeior.pesquisa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.devsupeior.pesquisa.entities.Game;
import com.devsupeior.pesquisa.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

	
}
