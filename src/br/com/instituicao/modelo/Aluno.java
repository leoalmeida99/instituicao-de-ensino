package br.com.instituicao.modelo;

public class Aluno extends Pessoa {

	private String ra;

	public Aluno(String nome, String cpf, String sexo, String ra) {
		super(nome, cpf, sexo);
		this.ra = ra;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "FUNCIONARIO TIPO:" + getClass() + "\nRA:" + this.ra + "\nNome: " + this.getNome() + 
			   "\nCPF: " + this.getCpf() + "\nSexo: " + this.getSexo()  + "\n";
	}
	
//	@Override
//	public String toString() {
//		
//		return super.toString();
//	}
}
