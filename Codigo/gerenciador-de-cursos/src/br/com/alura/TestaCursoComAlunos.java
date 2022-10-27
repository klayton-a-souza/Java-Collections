package br.com.alura;

public class TestaCursoComAlunos {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleções", 25));

		Aluno a1 = new Aluno("Venti", 0001);
		Aluno a2 = new Aluno("Zhongli", 0002);
		Aluno a3 = new Aluno("Raiden", 0003);
		Aluno a4 = new Aluno("Nahida", 0004);

		javaColecoes.matricularAluno(a1);
		javaColecoes.matricularAluno(a2);
		javaColecoes.matricularAluno(a3);
		javaColecoes.matricularAluno(a4);

		javaColecoes.getAlunosMatriculados().forEach(aluno -> {
			System.out.println(aluno);
		});
	}

}
