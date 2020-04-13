package com.capivara.capivara.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity()

public class Rede {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
	 private String nome;
	 private String lider;
	public Rede() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Rede(int id, String nome, String lider) {
		super();
		this.id = id;
		this.nome = nome;
		this.lider = lider;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLider() {
		return lider;
	}
	public void setLider(String lider) {
		this.lider = lider;
	}
	
	 
	 

}
