package src;

public class Constructors {

    String id;
    String name;
    String lastName;

    public static void main(String[] args) {
        // creación del objeto
        Constructors obj = new Constructors();
    }

    // contructor vacío
    public Constructors() {}

    // constructor con parámetros
    public Constructors(String id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    /* 
        * constructors *

        - son funciones que contienen las clases para permitir la creación de objetos
        - pueden recibir datos como no (constructor vacío)
        - se llaman siempre igual que la clase
        - no retorna ningún valor (ni siquiera void)
        - generalmente se utlizan dos tipos de constructores, el vacío o con parámetros
    */
}
