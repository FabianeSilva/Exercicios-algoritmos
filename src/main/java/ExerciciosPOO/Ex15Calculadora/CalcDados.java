package ExerciciosPOO.Ex15Calculadora;

public class CalcDados {
    private double operando1; // Armazena o primeiro operando
    private double operando2; // Armazena o segundo operando
    private char operacao; // Armazena a operação

    //Armazena o i-ésimo operando com o valor expresso em valor
    public void setOperando(int i, double valor) {
        if (i == 1) {
            this.operando1 = valor;
        } else if (i == 2) {
            this.operando2 = valor;
        }
    }

    //Retorna o valor do i-ésimo operando
    public double getOperando(int i) {
        if (i == 1) {
            return operando1;
        } else if (i == 2) {
            return operando2;
        }
        return 0; //Valor padrão
    }

    //Armazena o caracter op como sendo a operação atual
    public void setOperacao(char op) {
        this.operacao = op;
    }

    //Retorna o valor da operação atual
    public char getOperacao() {
        return operacao;
    }
}
