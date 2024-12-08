package ExerciciosPOO.Ex1PessoaAniversario;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazAniversario()
    {
        int novaIdade = this.idade + 1;
        this.idade = novaIdade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
