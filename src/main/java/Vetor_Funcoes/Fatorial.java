package Vetor_Funcoes;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicita ao usuário que insira um número
        System.out.println("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        //Verifica se o número é não-negativo
        if (numero < 0) {
            System.out.println("Número deve ser não-negativo.");
        } else {
            //Chama a função para calcular o fatorial
            long fatorial = calcularFatorial(numero);

            //Exibe o resultado
            System.out.println("O fatorial de " + numero + " é " + fatorial);
        }

        scanner.close();
    }
    //Função para calcular o fatorial de um número
    public static long calcularFatorial(int n) {
        long resultado = 1;
        for (int i =1; i <= n; i++) {
            resultado *=i;
        }
        return resultado;
    }

}

