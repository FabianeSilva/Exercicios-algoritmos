package Vetor_Funcoes;

import java.util.Scanner;

public class VetorSomentePares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Cria um vetor Q de 10 posições
        int[] Q = new int[10];
        int count = 0;

        //Lê os valores para o vetor Q, aceitando apenas números pares
        System.out.println("Digite 10 números pares para o vetor Q: ");
        while (count < Q.length) {
            System.out.print("Posição " + (count + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                Q[count] = numero;
                count++;
            } else {
                System.out.println("Número inválido. Por favor, insira um número par.");
            }
        }

        //Encontra o maior elemento e sua posição
        int maior = Q[0];
        int posicaoMaior = 0;
        for (int i = 1; i < Q.length; i++) {
            if (Q[i] > maior) {
                maior = Q[i];
                posicaoMaior = i;
            }
        }

        //Exibe o maior elemento e sua posição
        System.out.println("\nO maior elemento do vetor Q é " + maior + " e está na posição " + (posicaoMaior + 1) + "." );

        scanner.close();
    }
}
