package src;

public class Functions
{
    public static void main(String[] args)
    {
        // reutilizar este codigo a travez de una función
        holaMundo();
        System.out.println(mundo());
        System.out.println("Hola mundo!");
        System.out.println("Hola mundo!");
        parameterFunc("Leonardo");
    }
    
    // el private hace referencia a la visibilidad de la función, o sea que este método solo va a ser
    // visible dentro de esta clase
    private static void parameterFunc(String name) {
        System.out.println("Hola " + name);
    }

    private static void holaMundo() {
        System.out.println("Hola mundo!");
    }

    private static String mundo() {
        return "Mundo";
    }

    /* 
        el entorno en las funciones, cuando una variable es creada dentro de una función ese es su entorno, o sea solo
        existe dentro de esa función y no en el entorno de afura de la función
    */
}