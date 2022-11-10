package src;

public class Loops {
    public static void main(String[] args) {

        // bucle for
        for(int i = 0; i <= 10; i++) {
            System.out.println("i es igual a: " + i);
        }

        // bucle while
        int num = 0;
        while(num < 10) {
            System.out.println("num es iguala a: " + num);
            num++;
            // el brake
            if(num == 8)
            break;
            else
            continue;
        }
    }
}
