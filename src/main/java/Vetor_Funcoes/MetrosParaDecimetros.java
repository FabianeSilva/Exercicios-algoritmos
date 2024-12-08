package Vetor_Funcoes;

import java.util.Scanner;

public class MetrosParaDecimetros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pergunta ao usuário um valor em metros
        System.out.print("Digite um valor em metros: ");
        double metros = scanner.nextDouble();

        //Chama a função para converte e imprimir os valores
        converterEImprimir(metros);

        scanner.close(); //Fecha o scanner para liberar recursos.
    }

    //Função que converte e imprime os valores
    public static void converterEImprimir(double metros) {
        //Converte metros par decímetros, centímetros e milímetros
        double decimetros = metros * 10;
        double centimetros = metros * 100;
        double milimetros = metros * 1000;

        //Imprime resultados
        System.out.println("Valor em decímcetros: " + decimetros + " dm");
        System.out.println("Valor em centímetros: " + centimetros + " cm");
        System.out.println("Valor em milímetros: " + milimetros + " mm");
    }
}
