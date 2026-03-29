package com.example.demo.entity.dto.DoramaDTO;

import com.example.demo.entity.Dorama;

public record DoramaResponseDTO(
		String titulo) {
	
    public static DoramaResponseDTO fromEntity(Dorama dorama) {
        return new DoramaResponseDTO(dorama.getTitulo());
    }

}
