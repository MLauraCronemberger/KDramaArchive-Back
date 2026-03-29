package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Dorama;
import com.example.demo.entity.DoramaAtor;
import com.example.demo.entity.dto.DoramaDTO.DoramaAtorCreateDTO;

public interface DoramaAtorService {
	
	List<DoramaAtor> bindAtorDorama(Dorama dorama, List<DoramaAtorCreateDTO> doramaAtor);

}
