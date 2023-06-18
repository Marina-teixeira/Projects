package Exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Elevador elevador = new Elevador();
		System.out.println("Total de Andares: ");
		elevador.setTotalAndares(entrada.nextInt());
		System.out.println("Capacidade: ");
		elevador.setCapacidade(entrada.nextInt());
		System.out.println("Quantidade de Pessoas Presentes: ");
		elevador.setQtdPessoasPresentes(entrada.nextInt());
		System.out.println("Andar atual: ");
		elevador.setAndarAtual(entrada.nextInt());
		
		elevador.imprimirDadosElevador();
		
	}

}
