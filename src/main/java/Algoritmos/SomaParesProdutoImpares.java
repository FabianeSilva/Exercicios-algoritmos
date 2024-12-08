package Algoritmos;

import java.util.Scanner;

public class SomaParesProdutoImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int A = scanner.nextInt();

        int somaPares = 0;
        long produtoImpares = 1;

        if (A < 1) {
            System.out.println("Por favor, insira um número maior ou igual a 1.");
        } else {
            for (int i = 1; i <=A; i++) {
                if (i % 2 == 0) {
                    somaPares += i;
                } else {
                    produtoImpares *= i;
                }
            }

            System.out.println("Soma dos números pares até " + A + ": " + somaPares);
            System.out.println("Produto dos números ímpares até " + A + ": " + produtoImpares);
        }

        scanner.close();
    }
}
