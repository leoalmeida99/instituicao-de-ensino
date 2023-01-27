package br.com.instituicao.modelo;

public abstract class Pessoa {

	private String nome;
	private String cpf;
	private String sexo;

	public Pessoa(String nome, String cpf, String sexo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nSexo: " + this.sexo + "\n";
	}
//	public Endereco getEnd() {
//		return end;
//	}
//
//	public void setEnd(Endereco end) {
//		this.end = end;
//	}
}
