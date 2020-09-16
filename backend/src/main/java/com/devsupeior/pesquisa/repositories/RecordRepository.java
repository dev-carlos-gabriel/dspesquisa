package com.devsupeior.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsupeior.pesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
