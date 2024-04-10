import java.util.Scanner;
/**
* Author: Marcos Lopez Medina
**/
public class AceptaElReto219 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            System.out.println(contarPares());
        }

    }


    static int contarPares(){
        int decimos = sc.nextInt();
        int s = 0;
        int[] numeros = new int[decimos];
        for (int j = 0; j < numeros.length; j++) {
            numeros[j] = sc.nextInt();
        }
        return 0;
    }
}
