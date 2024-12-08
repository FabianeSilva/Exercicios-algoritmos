package Revisao_Geral;

import java.util.Scanner;

public class JuncaoMatrizes {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[15];
        int[] b = new int[15];
        int[] c = new int[30];

        //Leitura dos elementos da matriz A
        System.out.println("Digite os 15 elementos da matriz A:");
        for (int i = 0; i < a.length; i++) {
            System.out.print("A[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        //Leitura dos elementos da matriz B
        System.out.println("Digite os 15 elementos da matriz B:");
        for (int i = 0; i < b.length; i++) {
            System.out.print("B[" + i + "]: ");
            b[i] = scanner.nextInt();
        }

        //Construção da matriz C com a junção de A e B
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }

        //Apresentação da matriz C
        System.out.println("\nMatriz C (junção de A e B):");
        for (int i = 0; i < c.length; i++) {
            System.out.println("C[" + i + "]: " + c[i]);
        }

        scanner.close();

    }
}
