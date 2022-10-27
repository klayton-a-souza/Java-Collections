package br.com.alura;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleções", 25));

		Aluno a1 = new Aluno("Venti", 1);
		Aluno a2 = new Aluno("Zhongli", 2);
		Aluno a3 = new Aluno("Raiden", 3);
		Aluno a4 = new Aluno("Nahida", 4);

		javaColecoes.matricularAluno(a1);
		javaColecoes.matricularAluno(a2);
		javaColecoes.matricularAluno(a3);
		javaColecoes.matricularAluno(a4);

		System.out.println("Quem e o aluno com matricula 3");
		Aluno buscaAlunoPelaMatricula = javaColecoes.buscaAlunoPelaMatricula(3);
		System.out.println("Aluno: " + buscaAlunoPelaMatricula);
	}

}
