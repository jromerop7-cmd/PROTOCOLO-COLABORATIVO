package ejercicio2;

public class Pato implements Volador, Nadador {

    public String nombre;
    public Pato(String nombre) {
       this.nombre = nombre;
    }
    @Override
    public void nadar() {
        System.out.println(nombre + "Nadando");
    }

    @Override
    public void volar( ) {
        System.out.println( nombre +"Volando");
    }
}
