import java.util.*;
public class NthFibonaaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1)
        {
            System.out.println(0);
            return;
        }
        if(n == 2)
        {
            System.out.println(1);
            return;
        }
        int first = 0;
        int second = 1;
        int next = 0;
        for(int i=3;i<=n;i++)
        {
            next = first + second;
            first = second;
            second = next;
        }
        System.out.println(next);
    }
}