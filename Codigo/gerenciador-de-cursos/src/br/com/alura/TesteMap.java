package br.com.alura;

import java.util.HashMap;
import java.util.Map;

//Codigo 10.7: Para saber mais: Chave e Valores

public class TesteMap {

	public static void main(String[] args) {

		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);

		nomesParaIdade.keySet().forEach(nome -> {
			System.out.println(nome);
		});

		System.out.println("------------------------");
		
		nomesParaIdade.values().forEach(idade -> {
			System.out.println(idade);
		});
	}
}