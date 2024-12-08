package ExerciciosPOO.Ex6AreaFiguraGeometricaFuncionando;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FiguraGeometrica figura = null;

        //Menu para escolher a figura geométrica
        System.out.println("Escolha a figura geométrica para caluclar a área:");
        System.out.println("1. Quadrado");
        System.out.println("2. Retângulo");
        System.out.println("3. Triângulo");
        System.out.println("4. Círculo");
        int escolha = scanner.nextInt();

        //Processa a escolha do usuário
        switch (escolha) {
            case 1:
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                figura = new Quadrado(lado);
                break;
            case 2:
                System.out.print("Digite a largura do retângulo: ");
                double largura = scanner.nextDouble();
                System.out.print("Digite a altura do retângulo: ");
                double altura = scanner.nextDouble();
                figura = new Retangulo(largura,altura);
                break;
            case 3:
                System.out.print("Digite a base do triângulo: ");
                double base = scanner.nextDouble();
                System.out.print("Digite a altura do triângulo: ");
                altura = scanner.nextDouble();
                figura = new Triangulo(base, altura);
                break;
            case 4:
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                figura = new Circulo(raio);
                break;
            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }

        //Calcula e exibe a área da figura geométrica escolhida
        if (figura != null) {
            System.out.println("A área da figura geométrica é: " + figura.calcularArea());
        }

        scanner.close();
    }
}
