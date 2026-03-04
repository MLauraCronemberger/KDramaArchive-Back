package com.example.demo.entity;

import java.util.List;

import com.example.demo.enums.Categorias;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Dorama {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String tituloOriginal;   
    private String sinopse;
    private String resenha;
    private Integer anoLancamento;
    private Integer totalEpisodios;
    private Integer duracaoMediaMinutos;
    private String ondeAssistir;     
    private Integer nota;
    private String capaUrl;
    
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Categorias> categorias;

    @OneToMany(mappedBy = "dorama")
    private List<DoramaAtor> elenco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTituloOriginal() {
		return tituloOriginal;
	}

	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getResenha() {
		return resenha;
	}

	public void setResenha(String resenha) {
		this.resenha = resenha;
	}

	public Integer getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public Integer getTotalEpisodios() {
		return totalEpisodios;
	}

	public void setTotalEpisodios(Integer totalEpisodios) {
		this.totalEpisodios = totalEpisodios;
	}

	public Integer getDuracaoMediaMinutos() {
		return duracaoMediaMinutos;
	}

	public void setDuracaoMediaMinutos(Integer duracaoMediaMinutos) {
		this.duracaoMediaMinutos = duracaoMediaMinutos;
	}

	public String getOndeAssistir() {
		return ondeAssistir;
	}

	public void setOndeAssistir(String ondeAssistir) {
		this.ondeAssistir = ondeAssistir;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public String getCapaUrl() {
		return capaUrl;
	}

	public void setCapaUrl(String capaUrl) {
		this.capaUrl = capaUrl;
	}

	public List<Categorias> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categorias> categorias) {
		this.categorias = categorias;
	}

	public List<DoramaAtor> getElenco() {
		return elenco;
	}

	public void setElenco(List<DoramaAtor> elenco) {
		this.elenco = elenco;
	}

	public Dorama(Long id, String titulo, String tituloOriginal, String sinopse, String resenha, Integer anoLancamento,
			Integer totalEpisodios, Integer duracaoMediaMinutos, String ondeAssistir, Integer nota, String capaUrl,
			List<Categorias> categorias, List<DoramaAtor> elenco) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.tituloOriginal = tituloOriginal;
		this.sinopse = sinopse;
		this.resenha = resenha;
		this.anoLancamento = anoLancamento;
		this.totalEpisodios = totalEpisodios;
		this.duracaoMediaMinutos = duracaoMediaMinutos;
		this.ondeAssistir = ondeAssistir;
		this.nota = nota;
		this.capaUrl = capaUrl;
		this.categorias = categorias;
		this.elenco = elenco;
	}
    
    

}
