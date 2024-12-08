package ExerciciosPOO.Ex6AreaFiguraGeometricaFuncionando;

public class Quadrado extends FiguraGeometrica {

    private double lado;

    //Construtor que inicializa o lado do quadrado
    public Quadrado(double lado) {
        this.lado = lado;
    }

    //Implementação do método calcular Area para quadrado
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
