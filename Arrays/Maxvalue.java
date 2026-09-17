import java.util.*;
public class Maxvalue{
    public static void main(String[]args){
        //int[] arr={1,4,2,5};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        System.out.println(max);


    }
}