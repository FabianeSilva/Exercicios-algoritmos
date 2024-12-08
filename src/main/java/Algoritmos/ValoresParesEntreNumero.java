package Algoritmos;

import java.util.Scanner;

public class ValoresParesEntreNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro N maior que zero:");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("O número deve ser maior que zero");
        } else {
            System.out.println("Números pares entre 1 e " + N + ":");
                    for (int i = 1; i <=N; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                    }
        }

        scanner.close();
    }
}
