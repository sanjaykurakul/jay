/* Here the code return the Index of the target value using left and right pointer.. 
Computing mid value and that value is been evaluating with the target.
*/
import java.util.*;
public class findingtarget{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        //int index=-1(used '-1' for--->not found yet);
        int left=0;
        int right=n-1;
        int index=-1;
        while(left<=right){
            int mid= left+(right-left)/2;
            if(arr[mid]==target){
               index=mid;
               break;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.print(index);
        sc.close();
    }
}