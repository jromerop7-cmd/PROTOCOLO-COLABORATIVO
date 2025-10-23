package ejercicio2;
public class Animal implements Volador,Nadador {

    protected String animalVolador;
    protected String animalAcuatico;

    public Animal(String animalVolador, String animalAcuatico) {
        this.animalVolador = animalVolador;
        this.animalAcuatico = animalAcuatico;
    }

    @Override
    public void nadar() {
        System.out.println(animalAcuatico + ":" + "este animal va a poder nadar");
    }

    @Override
    public void volar() {
        System.out.println(animalVolador + ":"+" este animal va a poder volar");
    }

}
