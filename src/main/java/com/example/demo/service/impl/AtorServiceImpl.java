package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Ator;
import com.example.demo.entity.dto.AtorDTO.AtorCreateDTO;
import com.example.demo.entity.dto.AtorDTO.AtorResponseDTO;
import com.example.demo.repository.AtorRepository;
import com.example.demo.service.AtorService;

@Service
public class AtorServiceImpl implements AtorService {
	
	@Autowired
	private AtorRepository repository;
	
	@Override
	public AtorResponseDTO createAtor(AtorCreateDTO novoAtor) {
	    Ator ator = new Ator(novoAtor);
	    Ator atorSalvo = repository.save(ator);
	    return new AtorResponseDTO(atorSalvo);
		
	}

}
