package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> listaDeAulas = new ArrayList<Aula>();
	
	
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getListaDeAulas() {
		return Collections.unmodifiableList(listaDeAulas);
	}
	
	public void adiciona(Aula aula) {
		this.listaDeAulas.add(aula);
	}

}
