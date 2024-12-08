package ExerciciosPOO.Ex6AreaFiguraGeometricaFuncionando;

public class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    //Construtor que inicializaa a base e a altura do triângulo
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Implementação do método calcular Area do triângulo
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
