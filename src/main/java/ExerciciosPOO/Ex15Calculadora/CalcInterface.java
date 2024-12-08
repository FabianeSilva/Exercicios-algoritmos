package ExerciciosPOO.Ex15Calculadora;

import java.util.Scanner;

public class CalcInterface {

    private Scanner scanner = new Scanner(System.in); //Scanner para entrada de dados do usuário

    //Recebe o operando 1 da operação (i vale 1 ou 2) e retorna
    public double recebeOperando(int i) {
        System.out.print("Digite o operando " + i + ": ");
        return scanner.nextDouble();
    }

    //Recebe um char representando uma operação válida (+, -, * ou /) e retorna
    public char recebeOperacao() {
        System.out.print("Digite a operação ( +, -, *, / ou 's' para sair): ");
        return scanner.next().charAt(0);
    }

    //Mostra o resultado recebido como parâmetro
    public void mostraResultado(double res) {
        System.out.println("Resultado: " + res);
    }

}
