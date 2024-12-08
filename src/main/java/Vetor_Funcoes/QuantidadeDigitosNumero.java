package Vetor_Funcoes;

import java.util.Scanner;

public class QuantidadeDigitosNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pede ao usuário para inserir um número inteiro
        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        //Chama a função contarDigitos e armazena o resultado
        int quantidadeDigitos = contarDigitos(numero);

        //Exibe a quantidade de dígitos
        System.out.println("O número " + numero + " tem " + quantidadeDigitos + " dígitos.");

        scanner.close();
    }

    //Função que conta a quantidade de dígitos de um número
    public static int contarDigitos(int numero) {
        int contador = 0;
        int numAbsoluto = Math.abs(numero); // Para lidar com números negativos

        do {
            contador++;
            numAbsoluto /= 10; // Divide numAbsoluto por 10 e armazena o resultado de volta em numAbsoluto
        } while (numAbsoluto > 0); //Continua o loop até que numAbsoluto seja 0

        return contador;
    }
}
