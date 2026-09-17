import java.util.*;
public class reversepyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            // Print spaces
            for(int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for(int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}