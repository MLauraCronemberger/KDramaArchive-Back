package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.dto.DoramaDTO.DoramaCreateDTO;
import com.example.demo.entity.dto.DoramaDTO.DoramaResponseDTO;

@Service
public interface DoramaService {
	
	DoramaResponseDTO createDorama(DoramaCreateDTO novoDorama);

}
