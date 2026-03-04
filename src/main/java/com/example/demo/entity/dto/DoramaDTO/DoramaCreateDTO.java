package com.example.demo.entity.dto.DoramaDTO;

import java.util.List;

import com.example.demo.entity.DoramaAtor;
import com.example.demo.enums.Categorias;


public record DoramaCreateDTO(
	    String titulo,
	    String tituloOriginal,   
	    String sinopse,
	    String resenha,
	    Integer anoLancamento,
	    Integer totalEpisodios,
	    Integer duracaoMediaMinutos,
	    String ondeAssistir,     
	    Integer nota,
	    String capaUrl,
	    List<Categorias> categorias,
	    List<DoramaAtor> elenco
		) {

}
