package br.com.aline.cadastroCnpj.dto;


public class EmpresaDto {

	
	private Long id;
	
	private String cnpj;
	
	private String tipo;
	
	private String nome;
	
	private String razao_social;
	
	private String email;
	
	private String contato;
	
	private Long cep;
	
	private String uf;
	

	public EmpresaDto(Long id, String cnpj, String tipo, String nome, String razao_social, String email, String contato,
			Long cep, String uf) {
		super();
		this.id = id;
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

	public Long getCep() {
		return cep;
	}

	public void setCep(Long cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	
	

}
