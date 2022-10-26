package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revistando as ArrayLists",21);
		Aula a2 = new Aula("Listas de objetos",20);
		Aula a3 = new Aula("Relacionamento de listas e objetos",15);
		
		ArrayList<Aula> listaDeAulas = new ArrayList<>();
		
		listaDeAulas.add(a1);
		listaDeAulas.add(a2);
		listaDeAulas.add(a3);
		
		System.out.println(listaDeAulas);
		
		System.out.println("------------------------------------------");
		
		//Ordenando alfabeticamente	
		
		Collections.sort(listaDeAulas);		
		System.out.println(listaDeAulas);	
		
		System.out.println("-------------------------------------------");

		// Duas formas de ordenar a lista de aulas pelo tempo
		
		listaDeAulas.sort(Comparator.comparing(Aula::getTempo));
		//Collections.sort(listaDeAulas, Comparator.comparing(Aula::getTempo));	
		
		
		System.out.println(listaDeAulas);											
		
		
		
		
		
	}
}
