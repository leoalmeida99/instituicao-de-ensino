package br.com.instituicao.modelo;

public class Endereco {
	
	// Não utilizo mais essa classe, por enquanto...

	private String rua;
	private String bairro;
	private String estado;
	private int numero;
	private int cep;
	
	public Endereco(String rua, String bairro, String estado, int numero, int cep) {
		//super();
		this.rua = rua;
		this.bairro = bairro;
		this.estado = estado;
		this.numero = numero;
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	
}
