//Print the sum of every window of size K.
import java.util.*;
public class SumOfWindowsSizeK{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int windowsum=0;
        for(int i=0;i<k;i++){
            windowsum=windowsum+arr[i];
        }
        System.out.print(windowsum+" ");
         for(int i = k; i < n; i++)
        {
            windowsum = windowsum - arr[i - k] + arr[i];
            System.out.print(windowsum+ " ");   // print each new window's sum
        }
         }
}