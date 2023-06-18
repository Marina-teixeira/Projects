package Exercicio1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
	private String nome;
	private Date dataNascimento;
	private double altura;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void imprimirDados() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Nome: " + this.nome + "\n" +
							"Data de Nascimento: " + formato.format(this.dataNascimento) + "\n" +
							"Altura: " + this.altura);
	}
	
}
