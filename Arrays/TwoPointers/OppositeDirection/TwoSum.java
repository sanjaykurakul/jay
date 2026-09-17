// It only works when the array is sorted..
import java.util.*;
public class TwoSum{
    public static void TwoSum(int arr[],int target){
        int left=0;
        int right = arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.print((left+1) + " " + (right+1));
                return;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.print("No Solution");

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int target=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        TwoSum(arr,target);

    }
}