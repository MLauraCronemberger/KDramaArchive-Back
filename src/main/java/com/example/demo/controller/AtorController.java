package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.dto.AtorDTO.AtorCreateDTO;
import com.example.demo.entity.dto.AtorDTO.AtorResponseDTO;
import com.example.demo.service.impl.AtorServiceImpl;

@RestController
@RequestMapping(value="/ator")
@CrossOrigin("*")
public class AtorController {
	
	@Autowired
	private AtorServiceImpl service;
	
	@PostMapping("/cadastrar")
	public AtorResponseDTO createAtor(@RequestBody AtorCreateDTO novoAtor) {
		return service.createAtor(novoAtor);
	}

}
