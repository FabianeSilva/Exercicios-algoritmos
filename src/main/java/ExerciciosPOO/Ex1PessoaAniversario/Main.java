package ExerciciosPOO.Ex1PessoaAniversario;

public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 17);

        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
    }
}
