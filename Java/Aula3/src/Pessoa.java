
public class Pessoa {
	
	//atributos
	int id;
	String nome;

	//get e set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
	
	//métodos
	public void imprimeNome() { 
		System.out.println(this.nome);
	}
}
