package Vetor_Funcoes;


public class MaiorElementoVetor {

    public static void main(String[] args) {

        int[] vetor = {4, 6, 1, 6, 3, 6,2}; //Exemplo de vetor
        int[] resultado = new int [2]; //Este array irá armazenar o maior valor e sua frequencia

        //Verifica se o vetor está vazio
        if (vetor.length > 0) {
            encontrarMaiorEContar(vetor, resultado);

            System.out.println("Maior valor: " + resultado[0]);
            System.out.println("Frequência: " + resultado[1]);
        } else {
            System.out.println("O vetor está vazio.");
        }
    }

    public static void encontrarMaiorEContar(int[] vetor, int[] resultado) {

        int maior = vetor[0];
        int frequencia = 0;

        for (int j : vetor) {
            if (j > maior) {
                maior = j;
                frequencia = 1;
            } else if (j == maior) {
                frequencia++;
            }
        }

        resultado[0] = maior;
        resultado[1] = frequencia;

    }
}
