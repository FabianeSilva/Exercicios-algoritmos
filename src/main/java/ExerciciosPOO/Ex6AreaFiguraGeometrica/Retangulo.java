package ExerciciosPOO.Ex6AreaFiguraGeometrica;

public class Retangulo extends FiguraGeometrica {

    private double altura;

    //Lado serve como base
    public Retangulo(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.altura;
    }
}
