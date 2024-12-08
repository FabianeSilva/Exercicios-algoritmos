package Revisao_Geral;

import java.util.Scanner;

public class ReajusteSalarial {

    public static void main(String[] args) {
        //Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //Solicita ao usuário que insira o valor do salário mensal
        System.out.print("Digite o valor do salário mensal (SM): ");
        double salarioMensal = scanner.nextDouble();

        //Solicita ao usuário que insira o valor do percentual de reajuste
        System.out.print("Digite o valor do percentual de reajuste (PR): ");
        double percentualReajuste = scanner.nextDouble();

        //Calcula o novo salário
        double novoSalario = salarioMensal + (salarioMensal * percentualReajuste / 100);

        //Exibe o valor do novo salário
        System.out.println("O novo salário com aumento é: " + novoSalario);

        //Fecha o scanner
        scanner.close();

    }
}
