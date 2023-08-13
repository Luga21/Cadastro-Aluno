package br.unisinos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Instancia todas as disciplinas
		Disciplina disciplina = new Disciplina();
		
		disciplina.setNome("Processo de Software");
		disciplina.setSemestre(1);
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setNome("Introdução à Informática");
		disciplina1.setSemestre(1);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setNome("Fundamentos de Programação");
		disciplina2.setSemestre(1);

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setNome("Lógica Matemática");
		disciplina3.setSemestre(1);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setNome("TI TEC Experience");
		disciplina4.setSemestre(1);

		Disciplina disciplina5 = new Disciplina();
		disciplina5.setNome("Planejamento de Carreira");
		disciplina5.setSemestre(1);
		
		Disciplina disciplina6 = new Disciplina();
		disciplina6.setNome("Programação Orientada a objetos");
		disciplina6.setSemestre(2);

		Disciplina disciplina7 = new Disciplina();
		disciplina7.setNome("Modelos de Melhoria do Processo de Software");
		disciplina7.setSemestre(2);

		Disciplina disciplina8 = new Disciplina();
		disciplina8.setNome("Fundamentos de Banco de Dados");
		disciplina8.setSemestre(2);

		Disciplina disciplina9 = new Disciplina();
		disciplina9.setNome("Engenharia de Software: Requisitos e Análise");
		disciplina9.setSemestre(2);

		Disciplina disciplina10 = new Disciplina();
		disciplina10.setNome("TI TEC Experience 2");
		disciplina10.setSemestre(2);

		Disciplina disciplina11 = new Disciplina();
		disciplina11.setNome("Técnicas Comunicacionais");
		disciplina11.setSemestre(2);

		Disciplina disciplina12 = new Disciplina();
		disciplina12.setNome("Estruturas de Dados Lineares");
		disciplina12.setSemestre(3);

		Disciplina disciplina13 = new Disciplina();
		disciplina13.setNome("Engenharia de Software: Projeto e Desenvolvimento");
		disciplina13.setSemestre(3);

		Disciplina disciplina14 = new Disciplina();
		disciplina14.setNome("Implementação de Software");
		disciplina14.setSemestre(3);

		Disciplina disciplina15 = new Disciplina();
		disciplina15.setNome("Design de Interação");
		disciplina15.setSemestre(3);

		Disciplina disciplina16 = new Disciplina();
		disciplina16.setNome("TI TEC Experience 3");
		disciplina16.setSemestre(3);

		Disciplina disciplina17 = new Disciplina();
		disciplina17.setNome("Responsabilidade Social");
		disciplina17.setSemestre(3);
		
		Disciplina disciplina18 = new Disciplina();
		disciplina18.setNome("Gestão de Projetos de Software");
		disciplina18.setSemestre(4);

		Disciplina disciplina19 = new Disciplina();
		disciplina19.setNome("Processos de Teste de Software");
		disciplina19.setSemestre(4);

		Disciplina disciplina20 = new Disciplina();
		disciplina20.setNome("Estruturas de Dados Avançadas");
		disciplina20.setSemestre(4);

		Disciplina disciplina21 = new Disciplina();
		disciplina21.setNome("Desenvolvimento Web e Aplicativos");
		disciplina21.setSemestre(4);

		Disciplina disciplina22 = new Disciplina();
		disciplina22.setNome("TI TEC Experience 4");
		disciplina22.setSemestre(4);

		Disciplina disciplina23 = new Disciplina();
		disciplina23.setNome("Ética e Filosofia");
		disciplina23.setSemestre(4);

		Disciplina disciplina24 = new Disciplina();
		disciplina24.setNome("Arquitetura de Software");
		disciplina24.setSemestre(5);

		Disciplina disciplina25 = new Disciplina();
		disciplina25.setNome("Probabilidade e Estatística");
		disciplina25.setSemestre(5);

		Disciplina disciplina26 = new Disciplina();
		disciplina26.setNome("Fundamentos de Segurança Cibernética");
		disciplina26.setSemestre(5);

		Disciplina disciplina27 = new Disciplina();
		disciplina27.setNome("Projeto Final I");
		disciplina27.setSemestre(5);

		Disciplina disciplina28 = new Disciplina();
		disciplina28.setNome("TI TEC Experience 5");
		disciplina28.setSemestre(5);

		Disciplina disciplina29 = new Disciplina();
		disciplina29.setNome("Análise de Dados");
		disciplina29.setSemestre(5);
		
		Disciplina disciplina30 = new Disciplina();
		disciplina30.setNome("Projeto Final II");
		disciplina30.setSemestre(6);

		Disciplina disciplina31 = new Disciplina();
		disciplina31.setNome("Avaliação e Seleção de Soluções Técnicas e ROI");
		disciplina31.setSemestre(6);

		Disciplina disciplina32 = new Disciplina();
		disciplina32.setNome("Métricas e Gerenciamento quantitativo de Projetos");
		disciplina32.setSemestre(6);
		
		//Instancia o aluno para uso futuro
		Aluno aluno = new Aluno();
		
		//Instancia o scanner pra entrada do usuário
		Scanner scanner = new Scanner(System.in);
	    int opcao;
        
	    //Loop para funcionamento do menu
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Aluno no curso de Análise e desenvolvimento de Sistemas");
            System.out.println("2 - Mostrar todas as disciplinas");
            System.out.println("3 - Mostrar disciplinas cursadas");
            System.out.println("4 - Mostrar disciplinas faltantes");
            System.out.println("5 - Alterar semestre");
            System.out.println("6 - Formatura");
            System.out.println("9 - Sair");
            
            opcao = scanner.nextInt();
            
            //Switch que captura a opção selecionada no menu
            switch(opcao) {
                case 1:
                	//Realiza o cadastro do aluno
                    System.out.println("Digite o nome do aluno");
        		    String nome = scanner.next();
        		    aluno.setNome(nome);
        		    System.out.println("Digite o semestre do aluno");
        		    int semestre = scanner.nextInt();
        		    aluno.setSemestre(semestre);
        	    	
                    break;
                case 2:
                	//Mostra na tela todas as disciplinas
                	System.out.println("");
                	System.out.println(disciplina.getNome());
                	System.out.println(disciplina1.getNome());
                	System.out.println(disciplina2.getNome());
                	System.out.println(disciplina3.getNome());
                	System.out.println(disciplina4.getNome());
                	System.out.println(disciplina5.getNome());
                	System.out.println("");
                	System.out.println(disciplina6.getNome());
                	System.out.println(disciplina7.getNome());
                	System.out.println(disciplina8.getNome());
                	System.out.println(disciplina9.getNome());
                	System.out.println(disciplina10.getNome());
                	System.out.println(disciplina11.getNome());
                	System.out.println("");
                	System.out.println(disciplina12.getNome());
                	System.out.println(disciplina13.getNome());
                	System.out.println(disciplina14.getNome());
                	System.out.println(disciplina15.getNome());
                	System.out.println(disciplina16.getNome());
                	System.out.println(disciplina17.getNome());
                	System.out.println("");
                	System.out.println(disciplina18.getNome());
                	System.out.println(disciplina19.getNome());
                	System.out.println(disciplina20.getNome());
                	System.out.println(disciplina21.getNome());
                	System.out.println(disciplina22.getNome());
                	System.out.println(disciplina23.getNome());
                	System.out.println("");
                	System.out.println(disciplina24.getNome());
                	System.out.println(disciplina25.getNome());
                	System.out.println(disciplina26.getNome());
                	System.out.println(disciplina27.getNome());
                	System.out.println(disciplina28.getNome());
                	System.out.println(disciplina29.getNome());
                	System.out.println("");
                	System.out.println(disciplina30.getNome());
                	System.out.println(disciplina31.getNome());
                	System.out.println(disciplina32.getNome());
                	System.out.println("");
                	
                    break;
                case 3:
                	//Verifica se o aluno foi cadastrado
                	if (aluno.getSemestre() == 0) {
                		System.out.println("");
                		System.out.println("Você precisa cadastrar o aluno primeiro!");
                		System.out.println("");
                		break;
                	}
                	
                	//Mostra na tela as disciplinas finalizadas de acordo com o semestre do aluno
                    if(aluno.getSemestre() == 1) {
                    	System.out.println("");
                    	System.out.println("Aluno matriculado mas ainda não finalizou nenhuma disciplina");
                    	System.out.println("");	
                    }
                    //Mostra na tela as disciplinas faltantes de acordo com o semestre do aluno
                    if(aluno.getSemestre() == 2) {
                    	System.out.println("");
                    	System.out.println(disciplina.getNome());
                    	System.out.println(disciplina1.getNome());
                    	System.out.println(disciplina2.getNome());
                    	System.out.println(disciplina3.getNome());
                    	System.out.println(disciplina4.getNome());
                    	System.out.println(disciplina5.getNome());
                    	System.out.println("");	
                    }
                    //Mostra na tela as disciplinas faltantes de acordo com o semestre do aluno
                    if(aluno.getSemestre() == 3) {
                    	System.out.println("");
                    	System.out.println(disciplina.getNome());
                    	System.out.println(disciplina1.getNome());
                    	System.out.println(disciplina2.getNome());
                    	System.out.println(disciplina3.getNome());
                    	System.out.println(disciplina4.getNome());
                    	System.out.println(disciplina5.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina6.getNome());
                    	System.out.println(disciplina7.getNome());
                    	System.out.println(disciplina8.getNome());
                    	System.out.println(disciplina9.getNome());
                    	System.out.println(disciplina10.getNome());
                    	System.out.println(disciplina11.getNome());
                    	System.out.println("");	
                    }
                    //Mostra na tela as disciplinas faltantes de acordo com o semestre do aluno
                    if(aluno.getSemestre() == 4) {
                    	System.out.println("");
                    	System.out.println(disciplina.getNome());
                    	System.out.println(disciplina1.getNome());
                    	System.out.println(disciplina2.getNome());
                    	System.out.println(disciplina3.getNome());
                    	System.out.println(disciplina4.getNome());
                    	System.out.println(disciplina5.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina6.getNome());
                    	System.out.println(disciplina7.getNome());
                    	System.out.println(disciplina8.getNome());
                    	System.out.println(disciplina9.getNome());
                    	System.out.println(disciplina10.getNome());
                    	System.out.println(disciplina11.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina12.getNome());
                    	System.out.println(disciplina13.getNome());
                    	System.out.println(disciplina14.getNome());
                    	System.out.println(disciplina15.getNome());
                    	System.out.println(disciplina16.getNome());
                    	System.out.println(disciplina17.getNome());
                    	System.out.println("");	
                    }
                    //Mostra na tela as disciplinas faltantes de acordo com o semestre do aluno
                    if(aluno.getSemestre() == 5) {
                    	System.out.println("");
                    	System.out.println(disciplina.getNome());
                    	System.out.println(disciplina1.getNome());
                    	System.out.println(disciplina2.getNome());
                    	System.out.println(disciplina3.getNome());
                    	System.out.println(disciplina4.getNome());
                    	System.out.println(disciplina5.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina6.getNome());
                    	System.out.println(disciplina7.getNome());
                    	System.out.println(disciplina8.getNome());
                    	System.out.println(disciplina9.getNome());
                    	System.out.println(disciplina10.getNome());
                    	System.out.println(disciplina11.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina12.getNome());
                    	System.out.println(disciplina13.getNome());
                    	System.out.println(disciplina14.getNome());
                    	System.out.println(disciplina15.getNome());
                    	System.out.println(disciplina16.getNome());
                    	System.out.println(disciplina17.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina18.getNome());
                    	System.out.println(disciplina19.getNome());
                    	System.out.println(disciplina20.getNome());
                    	System.out.println(disciplina21.getNome());
                    	System.out.println(disciplina22.getNome());
                    	System.out.println(disciplina23.getNome());
                    	System.out.println("");	
                    }
                    //Mostra na tela as disciplinas faltantes de acordo com o semestre do aluno
                    if(aluno.getSemestre() == 6) {
                    	System.out.println("");
                    	System.out.println(disciplina.getNome());
                    	System.out.println(disciplina1.getNome());
                    	System.out.println(disciplina2.getNome());
                    	System.out.println(disciplina3.getNome());
                    	System.out.println(disciplina4.getNome());
                    	System.out.println(disciplina5.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina6.getNome());
                    	System.out.println(disciplina7.getNome());
                    	System.out.println(disciplina8.getNome());
                    	System.out.println(disciplina9.getNome());
                    	System.out.println(disciplina10.getNome());
                    	System.out.println(disciplina11.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina12.getNome());
                    	System.out.println(disciplina13.getNome());
                    	System.out.println(disciplina14.getNome());
                    	System.out.println(disciplina15.getNome());
                    	System.out.println(disciplina16.getNome());
                    	System.out.println(disciplina17.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina18.getNome());
                    	System.out.println(disciplina19.getNome());
                    	System.out.println(disciplina20.getNome());
                    	System.out.println(disciplina21.getNome());
                    	System.out.println(disciplina22.getNome());
                    	System.out.println(disciplina23.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina24.getNome());
                    	System.out.println(disciplina25.getNome());
                    	System.out.println(disciplina26.getNome());
                    	System.out.println(disciplina27.getNome());
                    	System.out.println(disciplina28.getNome());
                    	System.out.println(disciplina29.getNome());
                    	System.out.println("");	
                    }
                    
                    //Se o aluno for formado mostra todas as disciplinas
                    if(aluno.isFormado()) {
                    	System.out.println("");
                    	System.out.println(disciplina.getNome());
                    	System.out.println(disciplina1.getNome());
                    	System.out.println(disciplina2.getNome());
                    	System.out.println(disciplina3.getNome());
                    	System.out.println(disciplina4.getNome());
                    	System.out.println(disciplina5.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina6.getNome());
                    	System.out.println(disciplina7.getNome());
                    	System.out.println(disciplina8.getNome());
                    	System.out.println(disciplina9.getNome());
                    	System.out.println(disciplina10.getNome());
                    	System.out.println(disciplina11.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina12.getNome());
                    	System.out.println(disciplina13.getNome());
                    	System.out.println(disciplina14.getNome());
                    	System.out.println(disciplina15.getNome());
                    	System.out.println(disciplina16.getNome());
                    	System.out.println(disciplina17.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina18.getNome());
                    	System.out.println(disciplina19.getNome());
                    	System.out.println(disciplina20.getNome());
                    	System.out.println(disciplina21.getNome());
                    	System.out.println(disciplina22.getNome());
                    	System.out.println(disciplina23.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina24.getNome());
                    	System.out.println(disciplina25.getNome());
                    	System.out.println(disciplina26.getNome());
                    	System.out.println(disciplina27.getNome());
                    	System.out.println(disciplina28.getNome());
                    	System.out.println(disciplina29.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina30.getNome());
                    	System.out.println(disciplina31.getNome());
                    	System.out.println(disciplina32.getNome());
                    	System.out.println("");
                    }
                    
                    break;
                case 4:
                	//Verifica se o aluno foi cadastrado
                	if (aluno.getSemestre() == 0) {
                		System.out.println("");
                		System.out.println("Você precisa cadastrar o aluno primeiro!");
                		System.out.println("");
                		break;
                	}
                	
                	//Se o aluno é formado não mostra as disciplinas faltantes                	
                	if(aluno.isFormado()) {
                		System.out.println("");
                		System.out.println("Aluno já formado e portanto completou todas as disciplinas");
                		System.out.println("");
                	}
                	
                	//Mostra na tela as disciplinas faltantes de acordo com o semestre do aluno                	
                	if(aluno.getSemestre() == 6) {
                		System.out.println("");
                    	System.out.println(disciplina30.getNome());
                    	System.out.println(disciplina31.getNome());
                    	System.out.println(disciplina32.getNome());
                    	System.out.println("");
                    }
                	//Mostra na tela as disciplinas faltantes de acordo com o semestre do aluno
                    if(aluno.getSemestre() == 5) {
                    	System.out.println("");
                    	System.out.println(disciplina24.getNome());
                    	System.out.println(disciplina25.getNome());
                    	System.out.println(disciplina26.getNome());
                    	System.out.println(disciplina27.getNome());
                    	System.out.println(disciplina28.getNome());
                    	System.out.println(disciplina29.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina30.getNome());
                    	System.out.println(disciplina31.getNome());
                    	System.out.println(disciplina32.getNome());
                    	System.out.println("");
                    }
                    //Mostra na tela as disciplinas faltantes de acordo com o semestre do aluno
                    if(aluno.getSemestre() == 4) {
                    	System.out.println("");
                    	System.out.println(disciplina18.getNome());
                    	System.out.println(disciplina19.getNome());
                    	System.out.println(disciplina20.getNome());
                    	System.out.println(disciplina21.getNome());
                    	System.out.println(disciplina22.getNome());
                    	System.out.println(disciplina23.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina24.getNome());
                    	System.out.println(disciplina25.getNome());
                    	System.out.println(disciplina26.getNome());
                    	System.out.println(disciplina27.getNome());
                    	System.out.println(disciplina28.getNome());
                    	System.out.println(disciplina29.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina30.getNome());
                    	System.out.println(disciplina31.getNome());
                    	System.out.println(disciplina32.getNome());
                    	System.out.println("");
                    }
                    //Mostra na tela as disciplinas faltantes de acordo com o semestre do aluno
                    if(aluno.getSemestre() == 3) {
                    	System.out.println("");
                    	System.out.println(disciplina12.getNome());
                    	System.out.println(disciplina13.getNome());
                    	System.out.println(disciplina14.getNome());
                    	System.out.println(disciplina15.getNome());
                    	System.out.println(disciplina16.getNome());
                    	System.out.println(disciplina17.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina18.getNome());
                    	System.out.println(disciplina19.getNome());
                    	System.out.println(disciplina20.getNome());
                    	System.out.println(disciplina21.getNome());
                    	System.out.println(disciplina22.getNome());
                    	System.out.println(disciplina23.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina24.getNome());
                    	System.out.println(disciplina25.getNome());
                    	System.out.println(disciplina26.getNome());
                    	System.out.println(disciplina27.getNome());
                    	System.out.println(disciplina28.getNome());
                    	System.out.println(disciplina29.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina30.getNome());
                    	System.out.println(disciplina31.getNome());
                    	System.out.println(disciplina32.getNome());
                    	System.out.println("");
                    }
                    //Mostra na tela as disciplinas faltantes de acordo com o semestre do aluno
                    if(aluno.getSemestre() == 2) {
                    	System.out.println("");
                    	System.out.println(disciplina6.getNome());
                    	System.out.println(disciplina7.getNome());
                    	System.out.println(disciplina8.getNome());
                    	System.out.println(disciplina9.getNome());
                    	System.out.println(disciplina10.getNome());
                    	System.out.println(disciplina11.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina12.getNome());
                    	System.out.println(disciplina13.getNome());
                    	System.out.println(disciplina14.getNome());
                    	System.out.println(disciplina15.getNome());
                    	System.out.println(disciplina16.getNome());
                    	System.out.println(disciplina17.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina18.getNome());
                    	System.out.println(disciplina19.getNome());
                    	System.out.println(disciplina20.getNome());
                    	System.out.println(disciplina21.getNome());
                    	System.out.println(disciplina22.getNome());
                    	System.out.println(disciplina23.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina24.getNome());
                    	System.out.println(disciplina25.getNome());
                    	System.out.println(disciplina26.getNome());
                    	System.out.println(disciplina27.getNome());
                    	System.out.println(disciplina28.getNome());
                    	System.out.println(disciplina29.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina30.getNome());
                    	System.out.println(disciplina31.getNome());
                    	System.out.println(disciplina32.getNome());
                    	System.out.println("");
                    }
                    //Mostra na tela as disciplinas faltantes de acordo com o semestre do aluno
                    if(aluno.getSemestre() == 1) {
                    	System.out.println("");
                    	System.out.println(disciplina.getNome());
                    	System.out.println(disciplina1.getNome());
                    	System.out.println(disciplina2.getNome());
                    	System.out.println(disciplina3.getNome());
                    	System.out.println(disciplina4.getNome());
                    	System.out.println(disciplina5.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina6.getNome());
                    	System.out.println(disciplina7.getNome());
                    	System.out.println(disciplina8.getNome());
                    	System.out.println(disciplina9.getNome());
                    	System.out.println(disciplina10.getNome());
                    	System.out.println(disciplina11.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina12.getNome());
                    	System.out.println(disciplina13.getNome());
                    	System.out.println(disciplina14.getNome());
                    	System.out.println(disciplina15.getNome());
                    	System.out.println(disciplina16.getNome());
                    	System.out.println(disciplina17.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina18.getNome());
                    	System.out.println(disciplina19.getNome());
                    	System.out.println(disciplina20.getNome());
                    	System.out.println(disciplina21.getNome());
                    	System.out.println(disciplina22.getNome());
                    	System.out.println(disciplina23.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina24.getNome());
                    	System.out.println(disciplina25.getNome());
                    	System.out.println(disciplina26.getNome());
                    	System.out.println(disciplina27.getNome());
                    	System.out.println(disciplina28.getNome());
                    	System.out.println(disciplina29.getNome());
                    	System.out.println("");
                    	System.out.println(disciplina30.getNome());
                    	System.out.println(disciplina31.getNome());
                    	System.out.println(disciplina32.getNome());
                    	System.out.println("");
                    }
                    
                    break;
                case 5:
                	//Verifica se o aluno foi cadastrado
                	if (aluno.getSemestre() == 0) {
                		System.out.println("");
                		System.out.println("Você precisa cadastrar o aluno primeiro!");
                		System.out.println("");
                		break;
                	}
                	//Realiza a troca de semestre
                	System.out.println("Digite o novo semestre do aluno");
        		    int sem = scanner.nextInt();
        		    aluno.setSemestre(sem);
        		    break;
                	
                case 6:
                	//Verifica se o aluno foi cadastrado
                	if (aluno.getSemestre() == 0) {
                		System.out.println("");
                		System.out.println("Você precisa cadastrar o aluno primeiro!");
                		System.out.println("");
                		break;
                	}
                	//Verifica se o aluno pode se formar
                	if(aluno.getSemestre() < 6) {
                		System.out.println("");
                		System.out.println("O Aluno ainda não chegou no sexto semestre");
                		System.out.println("");
                	} else {
                		//Forma o aluno
                		System.out.println("");
                		System.out.println("Parabéns! O Aluno se formou em Análise e Desenvolvimento de Sistemas!");
                		System.out.println("");
                    	aluno.setFormado(true);
                    	aluno.setSemestre(7);
                	}
                	
                	break;	
                	
                case 9:
                	//Encerra o programa
                	System.out.println("Encerrando o programa....");
                	break;
                default:
                	//Opção não válida no menu
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 9);
        scanner.close();
	}
}