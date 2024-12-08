package Revisao_Geral;

import java.util.Scanner;

public class ConversaoTemperatura {

    public static void main(String[] args) {

        //Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //Solicita ao usuário que insira a temperatura em graus Celsius
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        //Converte a temperatura para Fahrenheit usando a fórmula
        double fahrenheit = (9 * celsius + 160) / 5;

        //Exibe o resultado da conversão
        System.out.println("A temperatura convertida em Fahrenheit é: " + fahrenheit);

        //Fecha o scanner
        scanner.close();
    }


}
