package Revisao_Geral;

import java.util.Scanner;

public class VetorDezNomes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        //Leitura dos nomes
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome da pessoa " + (i +1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        //Apresentação dos nomes
        System.out.println("\nNomes das pessoas:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Pessoa " + (i +1) + ": " + nomes[i]);
        }

        scanner.close();
    }
}
