package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DoramaAtor {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "dorama_id")
    private Doramas dorama;

    @ManyToOne
    @JoinColumn(name = "ator_id")
    private Atores ator;

    private String nomePersonagem;
    
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Doramas getDorama() {
		return dorama;
	}

	public void setDorama(Doramas dorama) {
		this.dorama = dorama;
	}

	public Atores getAtor() {
		return ator;
	}

	public void setAtor(Atores ator) {
		this.ator = ator;
	}

	public String getNomePersonagem() {
		return nomePersonagem;
	}

	public void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}



	public DoramaAtor(Long id, Doramas dorama, Atores ator, String nomePersonagem) {
		super();
		this.id = id;
		this.dorama = dorama;
		this.ator = ator;
		this.nomePersonagem = nomePersonagem;
	}
    
    

}
