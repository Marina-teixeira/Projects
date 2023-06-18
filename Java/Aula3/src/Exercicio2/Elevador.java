package Exercicio2;

public class Elevador {
	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int qtdPessoasPresentes;
	
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		if (andarAtual >= 0 & andarAtual <= this.totalAndares) {
			this.andarAtual = andarAtual;
		} else {
			System.out.println("Andar não permido!");
		}
	}
	public int getTotalAndares() {
		return totalAndares;
	}
	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getQtdPessoasPresentes() {
		return qtdPessoasPresentes;
	}
	public void setQtdPessoasPresentes(int qtdPessoasPresentes) {
		if (qtdPessoasPresentes <= this.capacidade) {
			this.qtdPessoasPresentes = qtdPessoasPresentes;
		} else {
			System.out.println("Quantidade de pessoas não permitida!");
		}
	}
	
	public void imprimirDadosElevador() {
		System.out.println("Total de Andares: " + this.totalAndares + "\n" +
							"Capacidade: " + this.capacidade + "\n" +
							"Quantidade de Pessoas Presentes: " + this.qtdPessoasPresentes + "\n" +
							"Andar atual: " + this.andarAtual);
	}
	
}
