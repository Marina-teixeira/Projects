package Exercicio3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Exercicio3.Pessoa;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dados das Universidades:");
		
		Universidade universidade1 = new Universidade();
		universidade1.setCodigo(1);
		System.out.println("Nome: ");
		universidade1.setNome(entrada.next());
		
		Universidade universidade2 = new Universidade();
		universidade2.setCodigo(2);
		System.out.println("Nome: ");
		universidade2.setNome(entrada.next());
		
		System.out.println("Dados das Pessoas:");
		
		Pessoa pessoa1 = new Pessoa();
		System.out.println("CPF: ");
		pessoa1.setCpf(entrada.next());
		System.out.println("Nome: ");
		pessoa1.setNome(entrada.next());
		System.out.println("Data de Nascimento [dd/MM/yyyy]: ");
		pessoa1.setDataNascimento(formato.parse(entrada.next()));
		System.out.println("Código da Universidade: ");
		pessoa1.setCodUniversidade(entrada.nextInt());

		
		Pessoa pessoa2 = new Pessoa();
		System.out.println("CPF: ");
		pessoa2.setCpf(entrada.next());
		System.out.println("Nome: ");
		pessoa2.setNome(entrada.next());
		System.out.println("Data de Nascimento [dd/MM/yyyy]: ");
		pessoa2.setDataNascimento(formato.parse(entrada.next()));
		System.out.println("Código da Universidade: ");
		pessoa1.setCodUniversidade(entrada.nextInt());
			
		System.out.println("CPF: " + pessoa1.getCpf() + "\n" +
							"Nome: " + pessoa1.getNome() + "\n" +
							"Data de Nascimento: " + formato.format(pessoa1.getDataNascimento()) + "\n" +
							"Código da Universidade" + pessoa1.getCodUniversidade());
		
		System.out.println("CPF: " + pessoa2.getCpf() + "\n" +
				"Nome: " + pessoa2.getNome() + "\n" +
				"Data de Nascimento: " + formato.format(pessoa2.getDataNascimento()) + "\n" +
				"Código da Universidade" + pessoa2.getCodUniversidade());
	}

}
