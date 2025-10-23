package ejercicio1;
public class Persona implements Trabajador, Hablador {

    public String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;

    }
    @Override
    public void trabajar() {
        System.out.println("Persona esta trabajando");
    }

    @Override
    public void hablar() {
        System.out.println("Persona esta hablado");
    }
}
