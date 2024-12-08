package Revisao_Geral;

import java.util.Scanner;

public class ValoresInteirosPositivosAteNegativo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite valores inteiros (um valor negativo para parar):");

        while (true) {
            valor = scanner.nextInt();

            if (valor < 0) {
                break;
            }

            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor) {
                menor = valor;
            }
        }

        if (maior == Integer.MIN_VALUE || menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum valor válido foi informado.");
        } else {
            System.out.println("Maior valor informado: " + maior);
            System.out.println("Menor valor informado: " + menor);
        }

        scanner.close();

    }
}
