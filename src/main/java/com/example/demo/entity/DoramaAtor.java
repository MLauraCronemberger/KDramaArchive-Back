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
    private Dorama dorama;

    @ManyToOne
    @JoinColumn(name = "ator_id")
    private Ator ator;

    private String nomePersonagem;
    
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Dorama getDorama() {
		return dorama;
	}

	public void setDorama(Dorama dorama) {
		this.dorama = dorama;
	}

	public Ator getAtor() {
		return ator;
	}

	public void setAtor(Ator ator) {
		this.ator = ator;
	}

	public String getNomePersonagem() {
		return nomePersonagem;
	}

	public void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}



	public DoramaAtor(Long id, Dorama dorama, Ator ator, String nomePersonagem) {
		super();
		this.id = id;
		this.dorama = dorama;
		this.ator = ator;
		this.nomePersonagem = nomePersonagem;
	}
    
    

}
