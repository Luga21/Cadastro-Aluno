package br.unisinos;

public class Aluno {
	
	//Nome do Aluno
	private String nome;
	
	//Curso do Aluno
	private String curso = "Análise e desenvolvimento de Sistemas";
	
	//Semestre do Aluno
	private int Semestre;
	
	//Formatura do aluno
	private boolean formado;
	

	//Construtor para instanciar a classe com nome e semestre
	public Aluno(String nome, int semestre) {
		this.nome = nome;
		Semestre = semestre;
	}

	//Construtor para instanciar a classe sem parâmetros
	public Aluno() {}

	//Método que retorna o nome do aluno
	public String getNome() {
		return nome;
	}

	//Método que define o nome do aluno
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Método que retorna o curso do aluno
	public String getCurso() {
		return curso;
	}
	
	//Método que retorna o semestre do aluno
	public int getSemestre() {
		return Semestre;
	}
	
	//Método que define o semestre do aluno	
	public void setSemestre(int semestre) {
		Semestre = semestre;
	}
	
	//Método que verifica se o aluno é formado
	public boolean isFormado() {
		return formado;
	}

	//Método que realiza a formatura do aluno
	public void setFormado(boolean formado) {
		this.formado = formado;
	}

	
	
	

}
