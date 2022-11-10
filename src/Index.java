package src;

// pubic es un modificador que hace referencia a la visibilidad de la clase, o sea
// esta clase se va a poder ver y utilizar
public class Index
{
    // la función principial, se va a poder utilizar en cualquier parte
    // static significa que no hace falta instanciarla
    // void que no retorna nada
    public static void main(String[] args)
    {
        // esta función imprime por consola y le agrega un salto de linea a lo impreso
        System.out.println("Hello World!");

        // creación de las variables
        /* 
         * estructura:
         * datatype
         * nombre
         * op asignación
         * valor dependiendo del dato
         */

        // enteros
        byte num_one = 1;
        short num_two = 23;
        int num_three = 456;
        long num_four = 34567;

        // punto flotante
        float decimal_one = 1.4f;
        double decimal_two = 2.45d;

        // caracter y strings
        char char_one = 'a';
        String str_one = "Leonardo";

        // booleanos
        boolean isActive = true;
    }
}