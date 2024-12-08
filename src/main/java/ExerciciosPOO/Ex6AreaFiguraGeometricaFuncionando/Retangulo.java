package ExerciciosPOO.Ex6AreaFiguraGeometricaFuncionando;

public class Retangulo extends FiguraGeometrica {

    private double largura;
    private double altura;

    //Construtor que inicializa a largura e a altura do retângulo
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    //Implementação do método calcularArea para retângulo
    @Override
    public double calcularArea() {
        return largura * altura;
    }
}
