package br.unit.aula5.Exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	static ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
	
	public static void main(String[] args) {
		
		String opcao = "";
		while (!opcao.equals("N")) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("1. Cadastrar alunos \n"
					+ "2. Cadastrar notas dos alunos \n"
					+ "3. Relatório de notas");
			opcao = entrada.next();
			if (opcao.equals("1")) {
				cadastrarAlunos();
			} else {
				if (opcao.equals("2")) {
					cadastrarNotas();
				} else {
					if (opcao.endsWith("3")) {
						relatorioNotas();
					} else {
						if (opcao.equals("N")) {
							break;
						} else {
							System.out.println("Opção inválida!");
						}
					}
				}
			}
			System.out.println("Deseja continuar? [S/N]");
			opcao = entrada.next();
		}
	}
	
	public static void cadastrarAlunos() {
		Aluno aluno = new Aluno();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nome: ");
		String nome = entrada.next();
		aluno.setNome(nome);
		listaAlunos.add(aluno);
	}
	
	public static void cadastrarNotas() {
		ArrayList<Double> listaNotas = new ArrayList<Double>();
		for (Aluno aluno : listaAlunos) {
			System.out.println("Aluno: " + aluno.getNome());
			Scanner entrada = new Scanner(System.in);
			System.out.println("Nota 1: ");
			double n1 = entrada.nextDouble();
			listaNotas.add(n1);
			System.out.println("Nota 2: ");
			double n2 = entrada.nextDouble();
			listaNotas.add(n2);
			aluno.setNotas(listaNotas);
			listaNotas = new ArrayList<Double>();
		}
	}
	
	public static void relatorioNotas() {
		for (Aluno aluno : listaAlunos) {
			double somaNotas = 0;
			for (Double notas : aluno.getNotas()) {
				somaNotas += notas;
			}
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Média: " + somaNotas/2 + "\n");

		}
	}

}
