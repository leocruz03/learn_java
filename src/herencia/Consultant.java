package src.herencia;

public class Consultant extends Person {

    public Consultant(int id, String dni, String name, String surname) {

        /*
            * super *

            La palabra super se utiliza en el lenguaje java para invocar el método constructor
            de una clase superior o clase padre de la cual queremos utilizar el mismo tipo de
            parametrización.
        */
        super(id, dni, name, surname);
        
    }

    public static void main(String[] args) {
        Consultant leonardo = new Consultant(01, "1002036706", "leonardo", "ardila");
        System.out.println(leonardo.id);
    }
    
}
