import java.util.Scanner;
/**
 * Author: Marcos Lopez Medina
 **/
public class AceptaElReto416 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int numPersonas = scanner.nextInt();
            if (numPersonas == 0)
                break;
            scanner.nextLine();

            String[] fechas = scanner.nextLine().split(" ");
            boolean hayRepetidos = false;

            for (int i = 0; i < numPersonas - 1; i++) {
                for (int j = i + 1; j < numPersonas; j++) {
                    if (fechas[i].substring(0, 5).equals(fechas[j].substring(0, 5))) {
                        hayRepetidos = true;
                        break;
                    }
                }
                if (hayRepetidos)
                    break;
            }

            if (hayRepetidos) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}

