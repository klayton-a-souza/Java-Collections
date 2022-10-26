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

	// Codigo: 3.5: Encapsulando o acesso aula
	public List<Aula> getListaDeAulas() {
		return Collections.unmodifiableList(listaDeAulas);
	}

	public void adiciona(Aula aula) {
		this.listaDeAulas.add(aula);
	}

	// Codigo 4.4: Obtendo o tempo total de aulas
	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : listaDeAulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}
	// Codigo 4.5: Melhorando a exibição do curso	
	@Override
	public String toString() {
		return "[Curso: " + this.nome + ",tempo total: " + this.getTempoTotal() + "]";
	}

}
