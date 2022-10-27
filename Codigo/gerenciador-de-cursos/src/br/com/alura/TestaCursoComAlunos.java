package br.com.alura;

public class TestaCursoComAlunos {

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

		javaColecoes.getAlunosMatriculados().forEach(aluno -> {
			System.out.println(aluno);
		});

		System.out.println("O aluno: " + a1 + " esta matriculado? " + javaColecoes.estaMatriculado(a1));
		
		Aluno zhongli = new Aluno("Zhongli",2);
		System.out.println("E esse Zhongli, esta matriculada?");
		System.out.println(javaColecoes.estaMatriculado(zhongli));
		
		// Codigo 7.3: Verificando se está matriculado
		System.out.println("O a2 e equals ao Zhongli?");
		System.out.println(a2.equals(zhongli));

	}

} 
