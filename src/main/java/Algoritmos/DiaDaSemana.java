package Algoritmos;

import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 7 para obter o dia correspondente da semana: ");
        int dia = scanner.nextInt();

        if (dia < 1 || dia > 7) {
            System.out.println("Número inválido! Por favor, digite um número entre 1 e 7.");
        } else {
            switch (dia) {
                case 1:
                    System.out.println("1 - Domingo");
                    break;
                case 2:
                    System.out.println("2 - Segunda-Feira");
                    break;
                case 3:
                    System.out.println("3 - Terça-Feira");
                    break;
                case 4:
                    System.out.println("4 - Quarta-Feira");
                    break;
                case 5:
                    System.out.println("5 - Quinta-Feira");
                    break;
                case 6:
                    System.out.println("6 - Sexta-Feira");
                    break;
                case 7:
                    System.out.println("7 - Sábado");
                    break;
                default:
                    System.out.println("Número inválido!");
                    break;
            }
        }

        scanner.close();
    }
}
