package Revisao_Geral;

import java.util.Scanner;

public class MatrizGrausCelsius {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[20];
        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        //Leitura dos 20 valores de temperatura
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Digite a temperatura " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
            soma += temperaturas[i];

            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }

            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
        }

        //Cálculo da média
        double media = soma / temperaturas.length;

        //Apresentação dos resultados
        System.out.println("\nMenor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Média das temperaturas: " + media);

        scanner.close();
    }
}
