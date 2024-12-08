package ExerciciosPOO.Ex7Bhaskara;

public class Delta {

    protected double a;
    protected double b;
    protected double c;

    protected double delta;

    public double calcularDelta() {
        delta = (b * b) - (4 * a * c);

        return delta;
    }

    public Delta(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
