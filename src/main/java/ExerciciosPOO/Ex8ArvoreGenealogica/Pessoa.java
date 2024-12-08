package ExerciciosPOO.Ex8ArvoreGenealogica;

public class Pessoa {

    private String nome;
    private int idade;

    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    @Override
    public String toString() {
        String texto = "";

        texto += "Nome: " + nome;
        texto += "\nIdade: " + idade;
        if (mae != null)
            texto += "\nNome da mãe: " + mae.nome;
        if (pai != null)
            texto += "\nNome da pai: " + pai.nome;

        return texto;
    }

}
