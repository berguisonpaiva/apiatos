package com.capivara.capivara.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity()

public class Membro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	@Column(name = "data_nascimento")
	private String datanascimento;
	private String sexo;
	private String categoria;
	private String ensino;
	private String endereco;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	private String celular;
	private String whatsapp;
	private String rede;
	private String email;
	@Column(name = "id_lider")
	private Long idLider;
	private String origem;
	@Column(name = "data_batismo")
	private String databatismo;
	private String status;
	private String estadocivil;
	private String filhos;
	private String conjuge;
	@Column(name = "data_casamento")
	private String datacasamento;
	
	
	
	public Membro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Membro(int id, String nome, String datanascimento, String sexo, String categoria, String ensino,
			String endereco, String complemento, String bairro, String cidade, String cep, String celular,
			String whatsapp, String rede, String email, Long idLider, String origem, String databatismo, String status,
			String estadocivil, String filhos, String conjuge, String datacasamento) {
	
		this.id = id;
		this.nome = nome;
		this.datanascimento = datanascimento;
		this.sexo = sexo;
		this.categoria = categoria;
		this.ensino = ensino;
		this.endereco = endereco;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.celular = celular;
		this.whatsapp = whatsapp;
		this.rede = rede;
		this.email = email;
		this.idLider = idLider;
		this.origem = origem;
		this.databatismo = databatismo;
		this.status = status;
		this.estadocivil = estadocivil;
		this.filhos = filhos;
		this.conjuge = conjuge;
		this.datacasamento = datacasamento;
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
	public String getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getEnsino() {
		return ensino;
	}
	public void setEnsino(String ensino) {
		this.ensino = ensino;
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
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}
	public String getRede() {
		return rede;
	}
	public void setRede(String rede) {
		this.rede = rede;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getIdLider() {
		return idLider;
	}
	public void setIdLider(Long idLider) {
		this.idLider = idLider;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDatabatismo() {
		return databatismo;
	}
	public void setDatabatismo(String databatismo) {
		this.databatismo = databatismo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	public String getFilhos() {
		return filhos;
	}
	public void setFilhos(String filhos) {
		this.filhos = filhos;
	}
	public String getConjuge() {
		return conjuge;
	}
	public void setConjuge(String conjuge) {
		this.conjuge = conjuge;
	}
	public String getDatacasamento() {
		return datacasamento;
	}
	public void setDatacasamento(String datacasamento) {
		this.datacasamento = datacasamento;
	}
	
	
	

}