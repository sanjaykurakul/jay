import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Upper Half
        for(int i = 1; i <= n; i++) {

            // Left Stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right Stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for(int i = n; i >= 1; i--) {

            // Left Stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right Stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}