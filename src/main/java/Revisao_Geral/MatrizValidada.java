package Revisao_Geral;

import java.util.Arrays;

public class MatrizValidada {

    public static void main(String[] args) {
        int[] matrizA = new int[12];
        int[] matrizB = new int[12];
        int[] matrizC = new int[24];

        //Preenchendo a matriz A com valores divisíveis por 2 ou 3
        int valor = 1;
        int indexA = 0;
        while (indexA < 12) {
            if (valor % 2 == 0 || valor % 3 == 0) {
                matrizA[indexA] = valor;
                indexA++;
            }
            valor++;
        }

        //Preenchendo a matriz B com valores que não sejam múltiplos de 5
        valor = 1;
        int indexB = 0;
        while (indexB < 12) {
            if (valor % 5 != 0) {
                matrizB[indexB] = valor;
                indexB++;
            }
            valor++;
        }

        //Construindo a matriz C como junção das matrizes A e B
        System.arraycopy(matrizA, 0, matrizC, 0, matrizA.length);
        System.arraycopy(matrizB,0, matrizC, matrizA.length, matrizB.length);

        //Apresentando os valores das matrizes
        System.out.println("Matriz A (valors divisíveis por 2 ou 3): " + Arrays.toString(matrizA));
        System.out.println("Matriz B (valores qu não são múltiplos de 5): " + Arrays.toString(matrizB));
        System.out.println("Matriz C (junção de A e B): " + Arrays.toString(matrizC));
    }
}
