package Revisao_Geral;

import java.util.Scanner;

public class MatrizesDivisiveis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrizA = new int[12];
        int[] matrizB = new int[12];

        //Leitura da matriz A
        System.out.println("Digite 12 valores divisíveis por 2 ou 3 para a matriz A:");
        for (int i = 0; i < matrizA.length; i++) {
            boolean valido = false;
            while (!valido) {
                System.out.print("Elemento " + (i + 1) + ": ");
                int valor = scanner.nextInt();
                if (valor % 2 == 0 || valor % 3 == 0) {
                    matrizA[i] = valor;
                    valido = true;
                } else {
                    System.out.println("Valor inválido! O valor deve ser divisível por 2 ou 3.");
                }
            }
        }

        //Leitura da matriz B
        System.out.println("\nDigite 12 valores que não sejam múltiplos de 5 para a matriz B:");
                for (int i = 0; i < matrizB.length; i++) {
                    boolean valido = false;
                    while (!valido) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        int valor = scanner.nextInt();
                        if (valor % 5 != 0) {
                            matrizB[i] = valor;
                            valido = true;
                        } else {
                            System.out.println("Valor inválido! O valor não deve ser mútiplo de 5.");
                        }
                    }
                }

                //Apresentar os valores das matrizes A e B
        System.out.println("\nMatriz A (valores divisíveis por 2 ou 3):");
                for (int valor : matrizA) {
                    System.out.print(valor + " ");
                }
                System.out.println("\n\nMatrizB (valores que não são múltiplos de 5):");
                for (int valor : matrizB) {
                    System.out.print(valor + " ");
                }

                scanner.close();
    }
}
