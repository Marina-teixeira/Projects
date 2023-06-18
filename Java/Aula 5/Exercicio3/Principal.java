package br.unit.aula5.Exercicio3;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws ParseException {
		String opcao = "";
		while (!opcao.equals("N")) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("1. Cadastro de Pessoa Física \n"
					+ "2. Cadastro de Pessoa Jurídica");
			opcao = entrada.next();
			
			if (opcao.equals("1")) {
				cadastraPessoaFisica();
			} else {
				if (opcao.equals("2")) {
					cadastraPessoaJuridica();
				} else {
					if (opcao.equals("N")) {
						break;
					} else {
						System.out.println("Opção inválida!");
					}
				} 
			}
			System.out.println("Deseja continuar? [S/N]");
			opcao = entrada.next();
		}

		
	}
	
	public static void cadastraPessoaFisica() throws ParseException {
		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

		Fisica pFisica = new Fisica();
		System.out.println("Nome: ");
		pFisica.setNome(entrada.next());
		System.out.println("Endereço: ");
		pFisica.setEndereço(entrada.next());
		System.out.println("Telefone: ");
		pFisica.setTelefone(entrada.next());
		System.out.println("CPF: ");
		pFisica.setCpf(entrada.next());
		System.out.println("RG: ");
		pFisica.setRg(entrada.next());
		System.out.println("Data Nascimento: [dd/mm/yyyy] ");
		pFisica.setDataNascimento(formato.parse(entrada.next()));
	}
	
	public static void cadastraPessoaJuridica()  {
		Scanner entrada = new Scanner(System.in);

		Juridica pJuridica = new Juridica();
		System.out.println("Nome: ");
		pJuridica.setNome(entrada.next());
		System.out.println("Endereço: ");
		pJuridica.setEndereço(entrada.next());
		System.out.println("Telefone: ");
		pJuridica.setTelefone(entrada.next());
		System.out.println("CNPJ: ");
		pJuridica.setCNPJ(entrada.next());
		System.out.println("Inscrição Estadual: ");
		pJuridica.setInscricaoEstadual(entrada.next());
		System.out.println("Inscrição Municipal ");
		pJuridica.setInscricaoMunicipal(entrada.next());
	}

}
