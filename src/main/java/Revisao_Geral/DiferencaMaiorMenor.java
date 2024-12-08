package Revisao_Geral;

import java.util.Scanner;

public class DiferencaMaiorMenor {

    public static void main(String[] args) {

        //Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //Solicita ao usuário que insira o valor de A
        System.out.print("Digite o valor do número inteiro A: ");
        int a = scanner.nextInt();

        //Solicita ao usuário que insira o valor de B
        System.out.print("Digite o valor do número inteiro B: ");
        int b = scanner.nextInt();

        //Determina o maior e o menor valor
        int maior, menor;
        if (a > b) {
            maior = a;
            menor = b;
        } else {
            maior = b;
            menor = a;
        }

        //Calcula a diferença
        int diferenca = maior - menor;

        //Exibe o resultado da diferença
        System.out.println("A diferença do maior valor pelo menor valor é: " + diferenca);

        //Fecha o scanner
        scanner.close();
    }
}
