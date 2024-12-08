package Revisao_Geral;

public class GraosDeTrigo {

    public static void main(String[] args) {
        //Definir as variáveis
        long numeroGraos = 1; // Número de grãos no primeiro quadro
        long somaGraos = 0; // Soma total de grãos

        //Loop para calcular o número de grãos em cada quadro e a soma total
        for (int quadro = 1; quadro <= 64; quadro++) {
            //Adicionar o número de grãos do quadro atual à soma total
            somaGraos += numeroGraos;
            //Exibir o número de grãos no quadro atual e a soma até agora
            System.out.println("Quadro " + quadro + ": " + numeroGraos + " grãos. Soma até agora: " + somaGraos);
            //Dobrar o número de grãos para o próximo quadro
            numeroGraos *= 2;
        }

        //Apresentar a soma total de grãos no tabuleiro
        System.out.println("A somo total de grãos de trigo no tabuleiro de xadrez é: " + somaGraos);
    }
}
