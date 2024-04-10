import java.util.Scanner;
/**
 * Author: Marcos Lopez Medina
 **/
public class AceptaElReto439 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String d1;
        String d2;
        char t1; 
        char t2;
        int v1;
        int v2;

        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            d1 = sc.next(); 
            d2 = sc.next();
            sc.nextLine();

            //System.out.println(d1);
            // System.out.println(d2);

            t1 = d1.charAt(0);
            t2 = d2.charAt(0);
            v1 = Integer.parseInt(d1.substring(2));
            v2 = Integer.parseInt(d2.substring(2));

            System.out.println(funcionifs(t1, t2, v1, v2));
        }


    }
    public static String funcionifs(char t1, char t2, int v1, int v2) {
        if (t1 == 'D' && t2 == 'T') {
            return ("V=" + v1 / v2);
        } else if (t1 == 'T' && t2 == 'D') {
            return ("V=" + v2 / v1);
        } else if (t1 == 'D' && t2 == 'V') {
            return ("T=" + v1 / v2);
        } else if (t1 == 'V' && t2 == 'D') {
            return ("T=" + v2 / v1);
        } else if (t1 == 'V' && t2 == 'T') {
            return ("D=" + v1*v2);
        } else {                       
            return ("D=" + v2*v1);
        }
    }

}

