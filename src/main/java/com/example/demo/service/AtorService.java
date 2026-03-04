package com.example.demo.service;


import com.example.demo.entity.dto.AtorDTO.AtorCreateDTO;
import com.example.demo.entity.dto.AtorDTO.AtorResponseDTO;

public interface AtorService {
	AtorResponseDTO createAtor(AtorCreateDTO novoAtor);
	

}
