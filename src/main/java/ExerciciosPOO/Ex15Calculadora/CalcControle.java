package ExerciciosPOO.Ex15Calculadora;

public class CalcControle {

    private CalcDados dados;  //Referência para o objeto CalcDados
    private CalcInterface iface;  //Referência para o objeto CalcInter

    //Construtor que inicializa as referências
    public CalcControle(CalcDados dados, CalcInterface iface) {
        this.dados = dados;
        this.iface = iface;
    }

    //Faz a calculadora funcionar
    public void executar() {
        while (true) {
            //Recebe o primeiro operando do usuário
            dados.setOperando(1, iface.recebeOperando(1));

            //Recebe a operação do usuário
            char operacao = iface.recebeOperacao();
            if (operacao == 's') { //Se a operação for 's', finaliza o programa
                System.exit(0);
            }
            dados.setOperacao(operacao);

            // Recebe o segundo operando do usuário
            dados.setOperando(2, iface.recebeOperando(2));

            //Executa a operação e mostra o resultado
            double resultado = opera(dados.getOperando(1),dados.getOperando(2), dados.getOperacao());
            iface.mostraResultado(resultado);

            // Armazena o resultado como primeiro operando para a próxima operação
            dados.setOperando(1, resultado);
        }
    }

    // Executa a operação desejada e retorna o resultado
    private double opera(double opn1, double opn2, char op) {
        switch (op) {
            case '+':
                return opn1 + opn2;
            case '-':
                return opn1 - opn2;
            case '*':
                return opn1 * opn2;
            case '/':
                if (opn2 != 0) {
                    return opn1 / opn2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    return 0;
                }
            default:
                System.out.println("Operação inválida!");
                return 0;
        }
    }

}