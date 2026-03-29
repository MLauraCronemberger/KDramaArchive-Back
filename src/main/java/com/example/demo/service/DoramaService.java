package com.example.demo.service;

import com.example.demo.entity.dto.DoramaDTO.DoramaCreateDTO;
import com.example.demo.entity.dto.DoramaDTO.DoramaResponseDTO;

public interface DoramaService {
	
	DoramaResponseDTO createDorama(DoramaCreateDTO novoDorama);

}
