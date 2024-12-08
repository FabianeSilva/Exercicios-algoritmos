package Revisao_Geral;

import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {
        //Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //Solicita ao usuário que insira os valores de a, b e c
        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        //Verifica se a equação é de segundo grau
        if (a == 0) {
            System.out.println("O valor de 'a' deve ser diferente de zero.");
        } else {
            //Calcula o valor de delta
            double delta = b * b - 4 * a * c;

            //Verifica as condições de delta
            if (delta < 0) {
                System.out.println("Não há solução nos números reais.");
            } else if (delta == 0) {
                double x = - b / (2 * a);
                System.out.println("O valor de x é: " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / ( 2* a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("O valor de x1 é: " + x1);
                System.out.println("O valor de x2 é: " + x2);
            }
        }

        //Fecha o scanner
        scanner.close();
    }
}
