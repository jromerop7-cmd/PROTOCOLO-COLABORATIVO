package ejercicio1;

public class Triangulo extends Figura {
    protected double base;
    protected double altura;

    public Triangulo(double x, double y,  double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = (base*altura)/2;
        return area;
    }
}
