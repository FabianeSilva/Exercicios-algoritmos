package Revisao_Geral;

public class ConversaoTemperaturasCelsiusFahrenheit {

    public static void main(String[] args) {
        //Loop de 10 a 100, incrementando de 10 em 10
        for (int celsius = 10; celsius <= 100; celsius +=10) {
            //Calcula a temperatura em Fahrenheit
            double fahrenheit = (9.0 * celsius + 160) / 5.0;
            //Exibe as temperaturas em Celsius e Fahrenheit
            System.out.printf("Celsius: %d -> Fahrenheit: %.2f%n", celsius, fahrenheit);
        }
    }
}
