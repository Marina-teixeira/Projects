package Exercicio3;

import java.util.Date;

public class Pessoa {
	private String cpf;
	private String nome;
	private Date dataNascimento;
	private int codUniversidade;

	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
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
	public int getCodUniversidade() {
		return codUniversidade;
	}
	public void setCodUniversidade(int codUniversidade) {
		this.codUniversidade = codUniversidade;
	}
	
}
