import java.util.*;
public class reversestring{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char arr[]=s.toCharArray();
        int left=0;
        int right=arr.length-1;
            while(left<right){
                char temp=arr[left];
                arr[left] =arr[right];
                arr[right] =temp;
                left++;
                right--;
            }
       String reversed = new String(arr); //Convert's the modified character array back into a String...
       System.out.println(arr);           //It is important to covert the array back to string.. Don't forget Bro.
 
    }
}