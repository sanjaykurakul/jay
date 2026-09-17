/*
1. Concept
Until now, Binary Search answered:
"Where is the element?"
Now the question is different.
"If the element is not present, where should it be inserted?"
The array must remain sorted after insertion.
2. Problem Statement
Given a sorted array of integers and a target value:
If the target exists, return its index.
Otherwise, return the index where it should be inserted.
*/
import java.util.*;
public class searchinsertionposition{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                sc.close();
                return;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
    }
    System.out.println(left);
        
    }
}
    
