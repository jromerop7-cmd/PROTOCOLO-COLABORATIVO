package ejercicio1;

public class Rectangulo extends Figura {

    protected double base;
    protected double altura;


    public Rectangulo(double b, double a, double x, double y) {
        super(x,y);
        this.base = b;
        this.altura = a;
    }
    @Override
    public double calcularArea() {
        double area = base * altura;
        return area;
    }

}
