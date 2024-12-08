package ExerciciosPOO.Ex8ArvoreGenealogica;

public class Main {

    public static void main(String[] args) {

        Pessoa filho = new Pessoa("Marcos", 16);

        Pessoa pai = new Pessoa("Alberto", 38);

        Pessoa mae = new Pessoa("Silvana", 45);

        filho.setMae(mae);
        filho.setPai(pai);

        System.out.println(filho);
    }
}
