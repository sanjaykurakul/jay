//Given a number n, find all pairs of prime numbers whose sum is n.

import java.util.*;
public class sumoftwoprimenum{

    static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean found = false;
        for (int i = 2; i <= n / 2; i++) {
            int second = n - i;
            if (isPrime(i) && isPrime(second)) {
                System.out.println(i + " + " + second);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No Prime Pair Found");
        }
    }
}