package Vetor_Funcoes;

import java.util.Scanner;

public class VetorMultiplicadoX {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Cria um vetor A de 5 posições
        int[] A = new int[5];

        //Lê os valores para o vetor A
        System.out.println("Digite 5 números para o vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print("Posição " + (i+1) + ": ");
            A[i] = scanner.nextInt();
        }

        //Lê mais um número e guarda em X
        System.out.print("Digite um número para a variável X: ");
        int X = scanner.nextInt();

        //Cria o vetor M para armazenar os resultados
        int[] M = new int[A.length];

        //Calcula os valores do vetor M
        for (int i = 0; i < A.length; i++) {
            M[i] = A[i] * X;
        }

        //Exibe o vetor M
        System.out.println("\nVetor M (resultados da multiplicação): ");
        for (int i = 0; i < M.length; i++) {
            System.out.println("Posição " + (i + 1) + ": " + M[i]);
        }

        scanner.close(); //Fecha o scanner para liberar recursos.
    }
}
