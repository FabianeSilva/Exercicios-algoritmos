package Algoritmos;

import java.util.Scanner;

public class MediaAritmetica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3;

        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();

        double media = calcularMedia(nota1, nota2, nota3);

        System.out.println("A média das três notas é: " + media);

        scanner.close();

    }

    private static double calcularMedia(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        return media;
    }
}
