package com.capivara.capivara.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity()

public class Celula {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
	 private String lideres;
	 private String rede; 
	 private String endereco;	
     private String complemento;	
     private String bairro;
	 private String cidade;	
	 private String cep;
	 private String diasemana;
	 private String horario;
	 private String categoria;
	public Celula() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Celula(int id, String lideres, String rede, String endereco, String complemento, String bairro,
			String cidade, String cep, String diasemana, String horario, String categoria) {
		super();
		this.id = id;
		this.lideres = lideres;
		this.rede = rede;
		this.endereco = endereco;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.diasemana = diasemana;
		this.horario = horario;
		this.categoria = categoria;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLideres() {
		return lideres;
	}
	public void setLideres(String lideres) {
		this.lideres = lideres;
	}
	public String getRede() {
		return rede;
	}
	public void setRede(String rede) {
		this.rede = rede;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getDiasemana() {
		return diasemana;
	}
	public void setDiasemana(String diasemana) {
		this.diasemana = diasemana;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	 

}
