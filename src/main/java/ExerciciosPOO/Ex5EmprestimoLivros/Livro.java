package ExerciciosPOO.Ex5EmprestimoLivros;

public class Livro {

    private String autor;
    private String nome;

    public Livro(String autor, String nome) {
        this.autor = autor;
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
