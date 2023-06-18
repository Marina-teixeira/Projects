package Exercicio1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException  {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Scanner entrada = new Scanner(System.in);
		
		Pessoa pessoa1 = new Pessoa();
		System.out.println("Nome: ");
		pessoa1.setNome(entrada.next());
		System.out.println("Data de Nascimento [dd/MM/yyyy]: ");
		pessoa1.setDataNascimento(formato.parse(entrada.next()));
		System.out.println("Altura: ");
		pessoa1.setAltura(entrada.nextDouble());
		
		Pessoa pessoa2 = new Pessoa();
		System.out.println("Nome: ");
		pessoa2.setNome(entrada.next());
		System.out.println("Data de Nascimento [dd/MM/yyyy]: ");
		pessoa2.setDataNascimento(formato.parse(entrada.next()));
		System.out.println("Altura: ");
		pessoa2.setAltura(entrada.nextDouble());
		
		Pessoa pessoa3 = new Pessoa();
		System.out.println("Nome: ");
		pessoa3.setNome(entrada.next());
		System.out.println("Data de Nascimento [dd/MM/yyyy]: ");
		pessoa3.setDataNascimento(formato.parse(entrada.next()));
		System.out.println("Altura: ");
		pessoa3.setAltura(entrada.nextDouble());
		
		pessoa1.imprimirDados();
		pessoa2.imprimirDados();
		pessoa3.imprimirDados();
		
	}

}
