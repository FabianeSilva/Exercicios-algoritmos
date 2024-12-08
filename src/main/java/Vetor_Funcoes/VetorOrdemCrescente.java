package Vetor_Funcoes;

import java.util.Arrays;
import java.util.Scanner;

public class VetorOrdemCrescente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Cria um vetor para armazenar os 5 números
        int[] numeros = new int[5];

        //Lê os 5 números e armazena no vetor
        System.out.println("Digite 5 números: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        //Ordena o vetor em ordem crescente
        Arrays.sort(numeros);

        //Exibe o vetor ordenado
        System.out.println("Vetor ordenado em ordem crescente: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
