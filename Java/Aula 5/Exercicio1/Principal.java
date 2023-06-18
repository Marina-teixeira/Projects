package br.unit.aula5.Exercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String opcao = "";
		while (!opcao.equals("N")) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("1. Metro quadrado -> P�s quadrados \n"
					+ "2. P� quadrado -> Cent�metro quadrado \n"
					+ "3. Milha quadrada -> Acre \n"
					+ "4. Acre -> P�s quadrados");
			opcao = entrada.next();
			if (opcao.equals("1")) {
				System.out.println("Valor: ");
				double valor = Double.parseDouble(entrada.next());
				System.out.println("Convers�o: " + converteM2Pes2(valor));
			} else {
				if (opcao.equals("2")) {
					System.out.println("Valor: ");
					double valor = Double.parseDouble(entrada.next());
					System.out.println("Convers�o: " + convertePes2CM2(valor));
				} else {
					if (opcao.equals("3")) {
						System.out.println("Valor: ");
						double valor = Double.parseDouble(entrada.next());
						System.out.println("Convers�o: " + converteMi2Acre(valor));
					} else {
						if (opcao.equals("4")) {
							System.out.println("Valor: ");
							double valor = Double.parseDouble(entrada.next());
							System.out.println("Convers�o: " + converteAcrePes2(valor));
						} else {
							if (opcao.equals("N")) {
								break;
							} else {
								System.out.println("Op��o inv�lida!");
							}
						}
					}
				} 
			}
			System.out.println("Deseja continuar? [S/N]");
			opcao = entrada.next();
		}


	}
	
	public static  double converteM2Pes2(double valor) {
		double retorno = valor*10.76;
		return retorno;
	}
	
	public static  double convertePes2CM2(double valor) {
		double retorno = valor*929;
		return retorno;
	}
	
	public static double converteMi2Acre(double valor) {
		double retorno = valor*640;
		return retorno;
	}
	
	public static double converteAcrePes2(double valor) {
		double retorno = valor*43560;
		return retorno;
	}

}
