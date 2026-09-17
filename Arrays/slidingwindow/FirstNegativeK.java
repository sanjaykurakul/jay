import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < n; i++) {

            if(arr[i] < 0) {
                queue.offer(arr[i]);
            }

            if(i >= k - 1) {

                if(queue.isEmpty()) {
                    System.out.print("0 ");
                } else {
                    System.out.print(queue.peek() + " ");
                }

                if(!queue.isEmpty() && arr[i - k + 1] == queue.peek()) {
                    queue.poll();
                }
            }
        }

        sc.close();
    }
}