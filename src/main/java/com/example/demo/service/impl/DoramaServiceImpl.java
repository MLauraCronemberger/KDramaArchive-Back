package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Dorama;
import com.example.demo.entity.dto.DoramaDTO.DoramaAtorCreateDTO;
import com.example.demo.entity.dto.DoramaDTO.DoramaCreateDTO;
import com.example.demo.entity.dto.DoramaDTO.DoramaResponseDTO;
import com.example.demo.enums.Categorias;
import com.example.demo.repository.DoramaRepository;
import com.example.demo.service.DoramaService;

@Service
public class DoramaServiceImpl implements DoramaService {
	
	@Autowired
	private DoramaRepository doramaRepository;
	
	@Override
	public DoramaResponseDTO createDorama(DoramaCreateDTO novoDorama) {
		Dorama dorama= new Dorama();
		
		dorama.setTitulo(novoDorama.titulo());
		dorama.setTituloOriginal(novoDorama.tituloOriginal());
		dorama.setSinopse(novoDorama.sinopse());
		dorama.setResenha(novoDorama.resenha());
		dorama.setAnoLancamento(novoDorama.anoLancamento());
		dorama.setTotalEpisodios(novoDorama.totalEpisodios());
		dorama.setDuracaoMediaMinutos(novoDorama.duracaoMediaMinutos());
		dorama.setOndeAssistir(novoDorama.ondeAssistir());
		dorama.setNota(novoDorama.nota());
		dorama.setCapaUrl(novoDorama.capaUrl());
		dorama.setCategorias(novoDorama.categorias());
		
		doramaRepository.save(dorama);
		
		return DoramaResponseDTO.fromEntity(dorama);
	}
}
