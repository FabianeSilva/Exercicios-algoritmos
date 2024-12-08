package Vetor_Funcoes;

public class VetorOitoPosicoes {

    public static void main(String[] args) {

        //Cria um vetor de 8 posições
        int[] cubos = new int[8];

        //Preenche o vetor com o cubo de cada índice
        for (int i = 0; i < cubos.length; i++) {
            cubos[i] = i * i * i; // Calcula o cubo do índice
        }

        //Exibe o vetor
        System.out.println("Vetor de cubos dos índices: ");
        for (int i =0; i < cubos.length; i++) {
            System.out.println("Índice " + i + ": " + cubos[i]);
        }
    }
}
