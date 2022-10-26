package br.com.alura;

public class Aula implements Comparable<Aula>{

	private String titulo;
	private int tempo;

	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	// Codigo 3.3: Reescrevendo o toString da classe Aula
	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", " + this.tempo + "minutos]";
	}

	// Codigo 3.4: Definindo um critério de comparação na classe Aula
	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
	
	

}
