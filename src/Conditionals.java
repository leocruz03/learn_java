package src;

public class Conditionals {
    public static void main(String[] args) {
        greaterThanNumber(4, 10);

    }

    private static void greaterThanNumber(int num_one, int num_two) 
    {
        if (num_one > num_two) {
            System.out.println("El número 1 es mayor que el número 2");
        } else if (num_one > num_two && num_two < 0) {
            System.out.println("El número 1 es mayor que el número 2 y el número 2 es menor que 0");
        } else {
            System.out.println("El número mayor es 2");
        }
    }
}
