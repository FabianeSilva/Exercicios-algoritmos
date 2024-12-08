package Algoritmos;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o sexo (H para homem, M para mulher): ");
        char sexo = scanner.next().charAt(0);

        double pesoIdeal;
        if (sexo == 'H' || sexo == 'h') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'M' || sexo =='m') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido! Por favor, digite o sexo correto!");
            scanner.close();
            return;
        }

        System.out.printf("O peso ideal é: %.2f kg%n", pesoIdeal);

        scanner.close();

    }
}
