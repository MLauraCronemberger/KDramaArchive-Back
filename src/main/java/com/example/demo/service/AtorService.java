package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.dto.AtorDTO.AtorCreateDTO;
import com.example.demo.entity.dto.AtorDTO.AtorResponseDTO;

@Service
public interface AtorService {
	AtorResponseDTO createAtor(AtorCreateDTO novoAtor);
	

}
