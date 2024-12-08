package Revisao_Geral;

import java.util.Scanner;

public class SucessorAntecessor {

    public static void main(String[] args) {
        //Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //Solicita ao usuário que insira um valor numérico inteiro
        System.out.print("Digite um valor numérico inteiro: ");
        int numero = scanner.nextInt();

        //Calcula o sucessor e o antecessor
        int sucessor = numero + 1;
        int antecessor = numero - 1;

        //Exibe o valor do sucessor e do antecessor
        System.out.println("O número sucessor é: " + sucessor);
        System.out.println("O número antecessor é: " + antecessor);

        //Fecha o scanner
        scanner.close();
    }
}
