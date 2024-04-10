import java.util.Scanner;
/**
* Author: Marcos Lopez Medina
**/ 
public class AceptaElReto138 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(factorial(20));
        System.out.println(zeroDretaV2(factorial(20)));
    }
    static long factorial(int n) {
        long r = 1;

        for (int i = 2; i <= n; ++i) {
            r *=i;
        }
        return r;

    }
    static int zeroDretaV2(long n) { // dentro de la funcion definimos la variable n como long
        int zeros = 0; //la variable zeros, que es un int(numeros) la definimos como 0

        while (n % 10 == 0) { // mientras que n (el numero resultante de la funcion de arriba entre 10 sea igual a 0, repetiremos el bucle
            ++zeros; //sumaremos un numero mas a 0
            n/= 10;
        }
        return zeros;
    }
}
