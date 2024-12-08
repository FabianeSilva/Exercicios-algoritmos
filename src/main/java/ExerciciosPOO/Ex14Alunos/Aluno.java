package ExerciciosPOO.Ex14Alunos;

public class Aluno {

    private int primeiraNotaParcial; //Atributo para a primeira nota parcial
    private int segundaNotaParcial; //Atributo para a segunda nota parcial
    private String nome; //Atributo para o nome do aluno

    //Construtor para inicializar os atributos do aluno
    public Aluno(String nome, int primeiraNotaParcial, int segundaNotaParcial) {
        this.nome =nome;
        this.primeiraNotaParcial = primeiraNotaParcial;
        this.segundaNotaParcial = segundaNotaParcial;
    }

    //Getters e setters para acessar e modificar os atributos
    public int getPrimeiraNotaParcial() {
        return primeiraNotaParcial;
    }

    public void setPrimeiraNotaParcial(int primeiraNotaParcial) {
        this.primeiraNotaParcial = primeiraNotaParcial;
    }

    public int getSegundaNotaParical () {
        return segundaNotaParcial;
    }

    public void setSegundaNotaParcial (int segundaNotaParcial) {
        this.segundaNotaParcial = segundaNotaParcial;
    }

    public String nome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Método para calcular a média das notas parciais
    public double calcularMedia() {
        return (primeiraNotaParcial + segundaNotaParcial) / 2.0;
    }

    //Método toString para representar o objeto como uma string
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", primeiraNotaParcial=" + primeiraNotaParcial +
                ", segundaNotaParcial=" + segundaNotaParcial +
                '}';
    }

}
