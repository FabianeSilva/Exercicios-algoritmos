package Vetor_Funcoes;

public class VetorDobroValor {

    public static void main(String[] args) {

        //Inicializa o vetor V com os valores fornecidos
        int[] V = {0, 5, 1, 4, 2, 7, 8, 3, 6}; //A posição 0 é ignorada

        //Cria um vetor V2 para armazenar o dobro dos valors de V
        int[] V2 = new int[V.length];

        //Calcula o dobro dos valores de V e armazena em V2
        for (int i = 1; i < V.length; i++) {
            V2[i] = V[i] * 2;
        }

        //Exibe os valores dos vetores V e V2 no console
        System.out.println("Vetor V: ");
        for (int i = 1; i < V.length; i++) {
            System.out.println("Posição " + i + ": " + V[i]);
        }

        System.out.println("\nVetor V2 (dobro dos valores de V): ");
        for (int i = 1; i < V2.length; i++) {
            System.out.println("Posição " + i + ": " + V2[i]);
        }
    }
}
