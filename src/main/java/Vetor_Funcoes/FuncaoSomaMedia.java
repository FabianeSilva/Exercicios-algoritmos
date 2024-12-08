package Vetor_Funcoes;

import java.util.Scanner;

public class FuncaoSomaMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pergunta ao usuário três valores
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        //Chama a função para calcular a soma
        double soma = calcularSoma(valor1, valor2, valor3);
        System.out.println("A soma dos valores é: " + soma);

        //Chama a função para calcular a média
        double media = calcularMedia(valor1, valor2, valor3);
        System.out.println("A média dos valores é: " + media);

        scanner.close();
    }

    //Função que calcula a soma de três valores
    public static double calcularSoma(double a, double b, double c) {
        return a + b + c;
    }

    //Função que calcula a média de três valoes
    public static double calcularMedia(double a, double b, double c) {
        double soma = calcularSoma(a, b, c);
        return soma / 3;
    }

}
