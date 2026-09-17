import java.util.*;
public class MAxSumSubarrayK{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        //int maxsum=0;
        int windowsum=0;
        for(int i=0;i<k;i++){
            windowsum=windowsum+arr[i];
        }
        int maxsum=windowsum;
        for(int i=k;i<n;i++){
            windowsum=windowsum-arr[i-k]+arr[i];
            if(windowsum>maxsum){
                maxsum=windowsum;
            }

        }
        System.out.print(maxsum);
    }
}