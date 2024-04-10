import java.util.Scanner;
/**
* Author: Marcos Lopez Medina
**/
public class AceptaElReto152 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n1 = sc.nextInt();
        while (n1 > 0) {
            calcularModa(n1);
            n1 = sc.nextInt();
        }
    }
    public static int calcularModa(int n1) { //Calcula cuantas veces se muestra cada numero
        int[] a = new int[10];
        int i = 0;
        for (i = 0; i < n1; i++){
            int n = sc.nextInt();
            a[n]++;
        }
        mostrarArray(a);
        numeroMayor(a);
        return i;
    }

    public static void mostrarArray(int[] a) { //Muestra cuantas veces se repite cada numero
        for (int i = 0; i < a.length ; i++){
            System.out.print(a[i] + ",");

        }
        System.out.println();
    }

    public static void numeroMayor(int[] a) { // Busca la posicion de el numero mas grande
        int max = a[0];
        int posicion = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                posicion = i;
            }
        }
        System.out.println("Moda:" + posicion);
    }

}

