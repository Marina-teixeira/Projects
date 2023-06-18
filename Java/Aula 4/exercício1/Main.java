package exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();        
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		do{
			cliente = new Cliente();     
			Scanner entrada = new Scanner(System.in);
			System.out.println("ID: ");
			cliente.setId(entrada.nextInt());
			System.out.println("Nome: ");
			cliente.setNome(entrada.next());
			System.out.println("Idade: ");
			cliente.setIdade(entrada.nextInt());
			System.out.println("Telefone: ");
			cliente.setTelefone(entrada.next());
			lista.add(cliente);
		}        

		while(cliente.getId() > 0); 
		
		for(int i = 0; i < lista.size()-1; i++){
			System.out.println(lista.get(i).getId() + "\n" + lista.get(i).getNome() + "\n" + lista.get(i).getIdade() + "\n" + lista.get(i).getTelefone());
			System.out.println();
		}
	}

	

}
