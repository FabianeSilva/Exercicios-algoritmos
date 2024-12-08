package Vetor_Funcoes;

import java.util.Scanner;

public class TemperaturaSemanal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Cria um vetor para armazenar as temperaturas médias diárias da semana (7 dias)
        double[] temperaturas = new double[7];

        //Lê as temperaturas médias diárias
        System.out.println("Digite a temperatura média de cada dia da semana: ");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        //Inicializa as variáveis para encontrar a menor e a maior temperatura da semana
        double menorTemperatura = temperaturas[0];
        double maiorTemperatura = temperaturas[0];
        double somaTemperatura = 0;

        //Calcula a menor, a maior temperatura e a soma das temperaturas
        for (double temp : temperaturas) {
            if (temp < menorTemperatura) {
                menorTemperatura = temp;
            }
            if (temp > maiorTemperatura) {
                maiorTemperatura = temp;
            }
            somaTemperatura += temp;
        }

        //Calcula a temperatura média semanal
        double mediaSemanal = somaTemperatura / temperaturas.length;

        //Conta o número de dias em que a temperatura foi inferior à média semanal
        int diasInferioresAMedia = 0;
        for (double temp : temperaturas) {
            if (temp < mediaSemanal) {
                diasInferioresAMedia++;
            }
        }

        //Exibe os resultados no console
        System.out.println("\nResultados: ");
        System.out.println("Menor temperatura da semana: " + menorTemperatura + "ºC");
        System.out.println("Maior temperatura da semana: " + maiorTemperatura + "ºC");
        System.out.println("Temperatura média semanal: " + String.format("%2f", mediaSemanal) + "ºC");
        System.out.println("Número de dias com temperatura inferior à média semanal: " + diasInferioresAMedia);

        scanner.close();
    }
}
