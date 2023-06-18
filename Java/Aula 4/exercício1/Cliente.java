package exercicio1;

public class Cliente {
    
    private int id = 0;
    private String nome = "";
    private int idade = 0;
    private String telefone = "";    
    
    public Cliente(){
        setId(id);
        setNome(nome);
        setIdade(idade);
        setTelefone(telefone);
    }

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
