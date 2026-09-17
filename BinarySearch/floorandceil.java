import java.util.Scanner;
public class floorandceil {
    public static int floor(int[] arr, int target,int n) {
        int left = 0;
        int right = arr.length - 1;
        int answer = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= target) {
                answer = arr[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }

    public static int ceil(int[] arr, int target,int n) {
        int left = 0;
        int right = arr.length - 1;
        int answer = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= target) {
                answer = arr[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println("Floor = " + floor(arr, target,n));
        System.out.println("Ceil = " + ceil(arr, target,n));

        sc.close();
    }
}