package com.devsupeior.pesquisa.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsupeior.pesquisa.RecordDTO;
import com.devsupeior.pesquisa.RecordInsertDTO;
import com.devsupeior.pesquisa.services.RecordService;

@RestController
@RequestMapping(value = "/records")
public class RecordResource {

	@Autowired
	RecordService recordService;

	@PostMapping
	public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO recordInsertDTO) {
		RecordDTO recordDTO = recordService.insert(recordInsertDTO);

		return ResponseEntity.ok().body(recordDTO);

	}
}
