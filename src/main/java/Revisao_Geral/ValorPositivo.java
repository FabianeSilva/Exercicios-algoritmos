package Revisao_Geral;

import java.util.Scanner;

public class ValorPositivo {

    public static void main(String[] args) {

        //Cria um scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //Solicita ao usuário que insira o valor de N
        System.out.print("Digite um valor numérico (positivo ou negativo): ");
        int n = scanner.nextInt();

        //Verifica se o valor é negativo e, se for, multiplica por -1
        if (n < 0) {
            n = n * -1;
        }

        //Exibe o valor positivo
        System.out.println("O número transformado em positivo é: " + n);

        //Fecha o scanner
        scanner.close();
    }
}
