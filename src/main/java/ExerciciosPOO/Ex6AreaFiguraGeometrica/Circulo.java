package ExerciciosPOO.Ex6AreaFiguraGeometrica;

public class Circulo extends FiguraGeometrica {

    //Por lado entende-se raio do círculo
    public Circulo(double lado) {
        super(lado);
    }

    @Override
    public double calcularArea() {
        return Math.PI * this.lado * this.lado;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI *this.lado;
    }


}
