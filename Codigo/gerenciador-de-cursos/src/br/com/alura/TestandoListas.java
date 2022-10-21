package br.com.alura;

import java.util.ArrayList;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> listaDeAulas = new ArrayList<>();
		listaDeAulas.add(aula1);
		listaDeAulas.add(aula2);
		listaDeAulas.add(aula3);

		for (String aula : listaDeAulas) {
			System.out.println("Aula: " + aula);
		}
		System.out.println("----------");

		listaDeAulas.remove(0);
		
		for (int i = 0; i < listaDeAulas.size(); i++) {
			System.out.println("Aula: " + listaDeAulas.get(i));
		}
		
		System.out.println("size(): " + listaDeAulas.size());
		
		listaDeAulas.forEach(aula -> System.out.println("Percorrendo: " + listaDeAulas));


	}

}
