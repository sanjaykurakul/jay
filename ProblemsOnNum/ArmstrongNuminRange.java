//Problem Statement
//Print all Armstrong numbers between two given numbers.
//Example
/*Input:
1 100
Output:
*/
/*1 2 3 4 5 6 7 8 9
*/
import java.util.Scanner;

public class ArmstrongNuminRange {

    static boolean isArmstrong(int n) {

        if (n < 0)
            return false;

        int original = n;

        int digits = 0;
        int temp = n;

        if (temp == 0) {
            digits = 1;
        } else {
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
        }

        int sum = 0;
        temp = n;

        while (temp > 0) {

            int digit = temp % 10;

            sum += (int)Math.pow(digit, digits);

            temp /= 10;
        }

        if (original == 0)
            sum = 0;

        return sum == original;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {

            if (isArmstrong(i)) {
                System.out.println(i + " ");
            }
        }
    }
}