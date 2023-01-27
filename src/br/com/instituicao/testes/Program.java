package br.com.instituicao.testes;

import br.com.instituicao.modelo.Aluno;
import br.com.instituicao.modelo.Professor;

public class Program {

	public static void main(String[] args) {

		Aluno p1 = new Aluno("Leonardo", "123456798-9", "Masculino", "1245");
		Professor p2 = new Professor("Paulo", "948756123-9", "Masculino", 1, 5087.90, "Programação");

		System.out.println(p1);
		System.out.println(p2);
	}

}
