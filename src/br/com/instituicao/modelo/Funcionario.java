package br.com.instituicao.modelo;

public abstract class Funcionario extends Pessoa {

	private int codigo;
	private double salario;

	public Funcionario(String nome, String cpf, String sexo, int codigo, double salario) {
		super(nome, cpf, sexo);
		this.codigo = codigo;
		this.salario = salario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
