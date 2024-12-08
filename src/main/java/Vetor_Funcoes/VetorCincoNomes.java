package Vetor_Funcoes;

import java.util.Scanner;

public class VetorCincoNomes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Cria um vetor para armazenar os nomes de 5 pessoas
        String[] nomes = new String[5];

        //Lê os nomes das 5 pessoas e armazena no vetor
        System.out.println("Digite os nomes de 5 pessoas: ");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        //Lê um nome qualquer para buscar no vetor
        System.out.print("Digite um nome para buscar: ");
        String nomeBusca = scanner.nextLine();

        //Verifica se o nome está present no vetor
        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeBusca)) {
                encontrado = true;
                break;
            }
        }

        //Exibe o resultado da busca
        if (encontrado) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }

        scanner.close();

    }
}
