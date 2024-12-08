package Algoritmos;

public class SerieFibonacci {

    public static void main(String[] args) {
        int n = 15;   // Número de termos na série Fibonacci que desejamos exibir
        int primeiro = 1, segundo = 1, proximo;

        System.out.println("Os 15 primeiro números da série Fibonacci são: ");

        //Exibe os dois primeiros números da série
        System.out.print(primeiro + ", " + segundo);

        // Loop começando do terceiro termo até o 15º
        for (int i = 3; i <= n; i++) {
            proximo = primeiro + segundo; //o próximo termo é a soma dos dois anteriores
            primeiro = segundo;  // Move o segundo para o primeiro
            segundo = proximo;   // Move o próximo para o segundo

            if (i < n) {
                System.out.print(" , " + proximo);
            } else {
                System.out.print(" , " + proximo + ".");  // Finaliza a sequência com um ponto
            }
        }
    }
}
