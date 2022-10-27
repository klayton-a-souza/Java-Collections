package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> listaDeAulas = new ArrayList<Aula>();
	private Set<Aluno> listaDeAlunos = new HashSet<>();

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
	
	public Set<Aluno> getAlunosMatriculados() {
		return Collections.unmodifiableSet(listaDeAlunos);
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

	public void matricularAluno(Aluno aluno) {
		this.listaDeAlunos.add(aluno);
	}

	// Codigo 7.3: Verificando se está matriculado
	public boolean estaMatriculado(Aluno aluno) {
		return this.listaDeAlunos.contains(aluno);
	}



}
