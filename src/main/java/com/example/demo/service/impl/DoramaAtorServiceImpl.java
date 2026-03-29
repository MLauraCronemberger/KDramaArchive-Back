package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Dorama;
import com.example.demo.entity.DoramaAtor;
import com.example.demo.entity.dto.DoramaDTO.DoramaAtorCreateDTO;
import com.example.demo.repository.AtorRepository;
import com.example.demo.repository.DoramaAtorRepository;
import com.example.demo.repository.DoramaRepository;
import com.example.demo.service.DoramaAtorService;

@Service
public class DoramaAtorServiceImpl implements DoramaAtorService {
	
	@Autowired
	private DoramaAtorRepository repository;
	
	@Autowired
	private AtorRepository atorRepository;
	
	@Override
	public List<DoramaAtor> bindAtorDorama(Dorama dorama, List<DoramaAtorCreateDTO> doramaAtor) {
	    List<DoramaAtor> lista = new ArrayList<>();

	    for (DoramaAtorCreateDTO dto : doramaAtor) {

	        DoramaAtor novoBindAtorDorama = new DoramaAtor();

	        // exemplo de preenchimento (ajusta conforme teus campos)
	        novoBindAtorDorama.setDorama(dorama);
	        novoBindAtorDorama.setAtor(atorRepository.findById(dto.idAtor()).get());
	        
	        novoBindAtorDorama.setNomePersonagem(dto.nomePersonagem());
	        
	        repository.save(novoBindAtorDorama);

	        lista.add(novoBindAtorDorama);
	    }
	    
	    return lista;
		
	}
}
