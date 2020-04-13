package com.capivara.capivara.resouce.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MembroResouce {

	@JsonProperty("nome_membro")
	private String nome;
	@JsonProperty("id_lider")
	private Long idLider;

	public MembroResouce() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MembroResouce(String nome, Long idLider) {
		this.nome = nome;
		this.idLider = idLider;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getIdLider() {
		return idLider;
	}

	public void setIdLider(Long idLider) {
		this.idLider = idLider;
	}

}
