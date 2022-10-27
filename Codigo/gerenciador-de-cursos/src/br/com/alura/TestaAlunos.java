package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {
	public static void main(String[] args) {

		Collection<String> alunos = new HashSet<>();

		alunos.add("Nahida");
		alunos.add("Noelle");
		alunos.add("Bennett");
		alunos.add("Razor");
		alunos.add("Venti");
		alunos.add("Raiden");
		alunos.add("Zhongli");

//		Codigo 5.5: Elementos duplicados
		System.out.println(alunos.size());
		alunos.add("Zhongli");
		System.out.println(alunos.size());
		

//		Codigo 5.4: Imprimindo conjunto
//		for (String aluno : alunos) {
//			System.out.println(aluno);
//		}
		
//		alunos.forEach(aluno -> System.out.println(aluno));

		boolean nahidaEstaMatriculada = alunos.contains("Nahida");
		System.out.println("Nahida esta matriculada? " + nahidaEstaMatriculada);

		System.out.println(alunos);

		List<String> alunosEmLista = new ArrayList<>(alunos);
	}
}
