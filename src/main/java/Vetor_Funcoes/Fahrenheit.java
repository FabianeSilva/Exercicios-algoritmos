package Vetor_Funcoes;

import java.util.Scanner;

public class Fahrenheit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pergunta ao usuário um valor em graus Fahrenheit
        System.out.println("Digite um valor em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        //Chama a função para converter para Celsius
        double celsius = converterParaCelsius(fahrenheit);

        //Imprime o resultado
        System.out.println(fahrenheit + " graus Fahrenheit é equivalente a " + celsius + " graus Celsius.");

        scanner.close();
    }

    //Função que converte grau Fahrenheit para graus Celsius
    public static double converterParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * (5 / 9);
    }

}
