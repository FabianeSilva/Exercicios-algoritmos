package Revisao_Geral;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class OrdenacaoDecrescente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numeros = new Integer[12];

        //Leitura dos 12 valores inteiros
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        //Ordenar os valores em ordem decrescente
        Arrays.sort(numeros, Collections.reverseOrder());

        //Apresentar os valores ordenados
        System.out.println("\nElementos ordenados em ordem decrescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}
