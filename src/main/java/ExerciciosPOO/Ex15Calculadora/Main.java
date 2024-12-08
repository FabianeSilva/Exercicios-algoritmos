package ExerciciosPOO.Ex15Calculadora;

public class Main {

    public static void main(String[] args) {
        CalcDados dados = new CalcDados(); //Cria um objeto CalcDados
        CalcInterface iface = new CalcInterface(); //Cria um objeto CalcInterface
        CalcControle controle = new CalcControle(dados, iface); //Cria um objeto CalcControle

        controle.executar(); //Inicia a execução da calculadora
    }
}
