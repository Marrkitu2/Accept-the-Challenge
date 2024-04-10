import java.util.Scanner;
/**
* Author: Marcos Lopez Medina
**/

public class AceptaElReto168 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       int n1 = sc.nextInt();
       while (n1>0) {
           System.out.println(contarNumeros(n1));
           n1 = sc.nextInt();
       }
    }

    // ir a la posicion a[n]
    public static int contarNumeros(int n1) {
        int[] a = new int[n1 -1];
        int i = 0;

        if (n1 <= 0) {
            System.out.println("Exit...");
        } else {
            for (i = 0; i < n1 -1; i++){
                a[i] = sc.nextInt();
            }
            ordenarEnteros(a);//ordenar la array
            for (i=0; i < n1 -1; i++){
                if (a[i] != i +1){
                    return(i+1);
                }
            }
        }
        return 0;
    }
    public static void ordenarEnteros(int[] n){
        int t;
        for (int i = 0; i < n.length - 1; i++) {
            // Agafa el segon valor entre el següent al primer i l'últim
            for (int j = i + 1; j < n.length; j++) {
                // Intercanviar si el primer és més gran que el segon
                if (n[i] > n[j]) {
                    t = n[i];
                    n[i] = n[j];
                    n[j] = t;
                }
            }
        }
    }
}
