package com.example.demo.entity.dto.AtorDTO;

import com.example.demo.entity.Ator;

public record AtorResponseDTO(
	    String nome
		) 

{  
	public AtorResponseDTO(Ator ator) {
        this(ator.getNome());
        }
}
