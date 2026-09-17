/*
Binary Search - Count Occurrences of an Element
1. Concept
We already know how to find:
First Occurrence 
Last Occurrence 
Now the number of occurrences is simply:
Count = Last Occurrence - First Occurrence + 1
2. Problem Statement
Given a sorted array (may contain duplicates), count how many times a target element appears.
If the target is not present, print 0.
*/
import java.util.*;
public class countoccurance{
    public static  int firstoccurance(int arr[],int n,int target){
        int left=0;
        int right=n-1;
        int index=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                index=mid;
                right=mid-1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }
        return index;
    }
        public static  int lastoccurance(int arr[],int n,int target){
            int left=0;
            int right=n-1;
            int index=-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(arr[mid]==target){
                    index=mid;
                    left=mid+1;

                }
                else if(arr[mid]<target){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            return index;
        }

    //}
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int first = firstoccurance(arr, n,target);

        if (first == -1) {
            System.out.println(0);
        } else {
            int last = lastoccurance(arr,n,target);
            System.out.println(last - first + 1);
        }

    }
}