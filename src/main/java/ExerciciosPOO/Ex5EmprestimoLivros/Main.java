package ExerciciosPOO.Ex5EmprestimoLivros;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("1112223334440", "Teste", "teste@teste.com");
        Livro livro = new Livro("JJ", "A jornada do programador Java");

        Emprestimo emprestimo = new Emprestimo(pessoa, livro);

        System.out.println(emprestimo);
    }
}
