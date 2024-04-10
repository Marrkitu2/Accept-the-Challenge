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
    static int zeroDretaV2(long n) { 
        int zeros = 0; 
        while (n % 10 == 0) {
            ++zeros;
            n/= 10;
        }
        return zeros;
    }
}
