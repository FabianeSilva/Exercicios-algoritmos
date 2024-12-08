package ExerciciosPOO.Ex12PessoaEinstein;

public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Albert Einstein", 1879, 3, 14);
        Pessoa p2 = new Pessoa("Isaac Newton", 1643, 1, 4);

        p1.calculaIdade();
        System.out.println(p1.informaNome() + "Idade: " + p1.informaIdade());
        p2.calculaIdade();
        System.out.println(p2.informaNome() + "Idade: " + p2.informaIdade());


    }
}
