import java.util.*;
public class minsum{
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
        int minsum=windowsum;
        for(int i=k;i<n;i++){
            windowsum=windowsum-arr[i-k]+arr[i];
            if(windowsum<minsum){
                minsum=windowsum;
            }
        }
        System.out.print(minsum);
    }
}