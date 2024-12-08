package ExerciciosPOO.Ex6AreaFiguraGeometrica;

//Triangulo Equilatero apenas é representado
public class Triangulo extends FiguraGeometrica {

    public Triangulo(double lado) {
        super(lado);
    }

    @Override
    public double calcularArea() {
        double area = this.lado * this.lado * Math.sqrt(3) / 4;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        return this.lado * 3;
    }
}
