package Algoritmos;

import java.util.Scanner;

public class MaiorValor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double C = scanner.nextDouble();

        double maior = A;

        if (B > maior) {
            maior = B;
        }

        if (C > maior){
            maior = C;
        }

        System.out.println(maior + " é o maior");

        scanner.close();


    }
}
