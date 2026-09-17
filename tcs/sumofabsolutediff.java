/*Given an unsorted array, first sort it in ascending order.
For every element, calculate the sum of absolute differences between it and all other elements*/
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        long[] prefix = new long[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++)
        {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        long totalSum = prefix[n - 1];
        for(int i = 0; i < n; i++) {
            long left = arr[i] * i;
            if(i > 0)
                left -= prefix[i - 1];
            long right = (totalSum - prefix[i]) - arr[i] * (n - i - 1);
            System.out.print(left + right + " ");
        }
    }
}