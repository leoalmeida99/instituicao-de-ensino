package br.com.instituicao.modelo;

public class Professor extends Funcionario {

	private String materia;

	public Professor(String nome, String cpf, String sexo, int codigo, double salario, String materia) {
		super(nome, cpf, sexo, codigo, salario);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "FUNCIONARIO TIPO:" + getClass() + "\nCodigo: " + this.getCodigo() + 
			   "\nNome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nSexo: "
			   + this.getSexo() + "\nMatéria: " + getMateria() + "\nSalario: " + getSalario() + "\n";
	}

}
