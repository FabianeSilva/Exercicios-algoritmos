package ExerciciosPOO.Ex3CasaPorta;

public class Main {

    public static void main(String[] args) {

        Porta p1 = new Porta("Preta", 20, 25, 3);
        Porta p2 = new Porta("Azul", 12, 15, 4);
        Porta p3 = new Porta("Vermelha", 20, 10, 7);

        Casa c1 = new Casa("Cinza", p1, p2, p3);

        c1.pinta("Verde");

        c1.p1.abre();
        c1.p2.abre();

        System.out.println(c1);
        System.out.println("Quantidade de portas abertas: " + c1.quantasPortasEstaoAbertas());
    }
}
