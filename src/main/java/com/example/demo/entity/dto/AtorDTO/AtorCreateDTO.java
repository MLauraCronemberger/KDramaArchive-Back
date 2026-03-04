package com.example.demo.entity.dto.AtorDTO;

import java.time.LocalDate;

public record AtorCreateDTO(
	    String nome,
	    LocalDate dataNascimento,
	    String bio,
	    String fotoUrl

) {
    

}
