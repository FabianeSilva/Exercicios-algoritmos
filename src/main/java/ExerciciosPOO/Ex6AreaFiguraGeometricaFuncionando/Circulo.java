package ExerciciosPOO.Ex6AreaFiguraGeometricaFuncionando;

public class Circulo extends FiguraGeometrica {

    private double raio;

    //Construtor que inicializa o raio do círculo
    public Circulo(double raio) {
        this.raio = raio;
    }

    //Implemntação do método calcular Area para círculo
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
