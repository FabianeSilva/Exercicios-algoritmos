package Vetor_Funcoes;

import java.util.Scanner;

public class ArgumentoPositivoNegativo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário para inserir um número
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        //Chama a função classificarNumero e imprime o resultado
        char resultado = classificarNumero(numero);
        System.out.println("O número é: " + resultado);

        scanner.close();
    }

    //Função que verifica se o número é positivo ou não
    public static char classificarNumero(int numero) {
        if (numero > 0) {
            return 'P'; //'P' para positivo
        } else {
            return 'N'; //'N' para zero ou negativo
        }
    }

}
