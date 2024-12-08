package Algoritmos;

import java.util.Scanner;

public class MaiorElementoDeCinco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[5];

        System.out.println("Digite Cinco Valores: ");
        for (int i = 0; i < 5; i++) {
            valores[i] = scanner.nextInt();
        }

        int maior = valores[0];
        int contagem = 1;

        for (int i = 1; i < 5; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
                contagem = 1;
            } else if (valores[i] == maior) {
                contagem++;
            }
        }

        System.out.println("O maior valor é: " + maior);
        System.out.println("O maior valor apareceu " + contagem);

        scanner.close();


    }
}
