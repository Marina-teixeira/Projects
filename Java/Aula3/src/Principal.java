
public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setId(1);
		pessoa1.setNome("João");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setId(2);
		pessoa2.setNome("Maria");
		
		pessoa1.imprimeNome();
		pessoa2.imprimeNome();
	}

}
