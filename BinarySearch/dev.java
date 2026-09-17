import java.util.*;
public class dev{
    public static int floor(int target,int arr[],int n){
        int left=0;
        int right=n-1;
        int index=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]<=target){
                index=mid;
                left=mid+1;
                //return;
            }
            else{
                right=mid-1;
            }
        }
        return index;
    }
    public static int ceil(int target,int arr[],int n){
        int left=0;
        int right=n-1;
        int index=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>=target){
                index=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return index;


    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
       
        System.out.println("Floor = " + floor(target, arr,n));
        System.out.println("Ceil = " + ceil(target, arr,n));
    }
}