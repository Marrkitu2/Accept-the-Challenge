import java.util.Scanner;
/**
 * Author: Marcos Lopez Medina
 **/
public class AceptaElReto265 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        sumadescendente(4578);
    }

    public static void sumadescendente(int numero) {
        String n= "" + numero;
        int n2;
        int total = Integer.parseInt(n);

        while(n.length() > 1); {
            n = n.substring(1);
            n2 = Integer.parseInt(n);
            total = total + n2;
        }
        System.out.println(total);
    }
}
