package ExerciciosPOO.Ex13Universidades;

public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Albert Einstein", 1879, 3, 14);
        Pessoa p2 = new Pessoa("Isaac Newton", 1643, 1, 4);

        Universidade univ1 = new Universidade("Bologna");

        Universidade univ2 = new Universidade("MIT");

        p1.setUniversidade(univ2);
        p2.setUniversidade(univ1);

        p1.mostrarNomeEUniversidade();
        p2.mostrarNomeEUniversidade();

    }
}
