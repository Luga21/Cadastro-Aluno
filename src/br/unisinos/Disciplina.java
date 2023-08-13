package br.unisinos;

public class Disciplina {
	
	//Nome da disciplina	
	private String nome;
	
	//Semestre da disciplina
	private int semestre;

	//Método que retorna o nome da disciplina
	public String getNome() {
		return nome;
	}

	//Método que define o nome da disciplina
	public void setNome(String nome) {
		this.nome = nome;
	}

	//Método que retorna o semestre da disciplina
	public int getSemestre() {
		return semestre;
	}

	//Método que define o semestre da disciplina
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

}
