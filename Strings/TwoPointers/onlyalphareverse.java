/*Problem Statement
Given a String,
reverse only the letters.
Leave digits and special characters in their original positions.*/
import java.util.*;
public class onlyalphareverse{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char arr[]=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetter(arr[left])){
                left++;
            }
            while(left<right && !Character.isLetter(arr[right])){
                right--;
            }
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println(new String(arr));
    }
}