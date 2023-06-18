package exercicio2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		ArrayList<Jogador> listaJogadores = new ArrayList<Jogador>();
		Jogador jogador = new Jogador();
		
		do {
			System.out.println("ID: ");
			jogador.setId(entrada.nextInt());
			System.out.println("Nome: ");
			jogador.setNome(entrada.next());
			System.out.println("Apelido");
			jogador.setApelido(entrada.next());
			System.out.println("Data Nascimento: ");
			jogador.setDataNascimento(formato.parse(entrada.next()));
			System.out.println("Número: ");
			jogador.setNumero(entrada.nextInt());
			System.out.println("Posição: ");
			jogador.setPosicao(entrada.next());
			System.out.println("Qualidade: ");
			jogador.setQualidade(entrada.nextInt());
			System.out.println("Cartões: ");
			jogador.setCartoes(entrada.nextInt());
			System.out.println("Suspenso? [S/N] ");
			String suspenso = entrada.next();
			if (suspenso.equalsIgnoreCase("S")) {
				jogador.setSuspenso(true);
			} else {
				jogador.setSuspenso(false);
			}
			listaJogadores.add(jogador);
		} while (jogador.getId() > 0);
		
		Time time = new Time();
		
		System.out.println("Nome: ");
		time.setNome(entrada.next());
		System.out.println("Apelido");
		time.setApelido(entrada.next());
		System.out.println("Fundação: ");
		time.setFundacao(formato.parse(entrada.next()));
		time.setJogadores(listaJogadores);
		
		System.out.println("Time: " + time.getNome() + "\n");
		for(int i = 0; i < time.getJogadores().size()-1; i++){
			System.out.println("Nome: " + time.getJogadores().get(i).getNome() + " - " + 
					"Número: " + time.getJogadores().get(i).getNumero() + " - " + 
					"Suspenso? " + (time.getJogadores().get(i).isSuspenso() ? "Sim" : "Não"));
			System.out.println();
		}
	}

}
