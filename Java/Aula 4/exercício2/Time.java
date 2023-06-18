package exercicio2;

import java.util.ArrayList;
import java.util.Date;

public class Time {
	private String nome;
	private String apelido;
	private Date fundacao;
	private ArrayList<Jogador> jogadores;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public Date getFundacao() {
		return fundacao;
	}
	public void setFundacao(Date fundacao) {
		this.fundacao = fundacao;
	}
	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	
}
