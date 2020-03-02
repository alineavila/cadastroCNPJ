package br.com.aline.cadastroCnpj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity(name = "tb_empresa")
public class Empresa{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true, nullable = false)
	private String cnpj;
	
	@Column(nullable = false)
	private String tipo;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String razao_social;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String contato;
	
	@Column(nullable = false)
	private String cep;
	
	@Column(nullable = false)
	private String uf;
	


	
	public Empresa() {
		
	}
	
	public Empresa(String cnpj, String tipo, String nome, String razao_social, String email, String contato, String cep,
			String uf) {
		super();
		this.cnpj = cnpj;
		this.tipo = tipo;
		this.nome = nome;
		this.razao_social = razao_social;
		this.email = email;
		this.contato = contato;
		this.cep = cep;
		this.uf = uf;
	}
	
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getRazao_social() {
		return razao_social;
	}


	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContato() {
		return contato;
	}


	public void setContato(String contato) {
		this.contato = contato;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
	
	


}
