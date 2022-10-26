package br.com.alura;

import java.util.List;

public class TesteCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
//		List<Aula> aulas = javaColecoes.getListaDeAulas();
//		System.out.println(aulas);
//		
//		aulas.add(new Aula("Trabalhando com ArrayList", 21));
		
//		javaColecoes.getListaDeAulas().add(new Aula("Trabalhando com ArrayList", 21));
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleções", 25));
		System.out.println(javaColecoes.getListaDeAulas());
		
		
		
	}
}
