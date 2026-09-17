import java.util.*;
public class stringpalindrome{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int left=0;
        int right=s.length()-1;
        boolean ispalindrome=true;
        while(left<right)
        {
            if(s.charAt(left)==s.charAt(right))
            {
                left++;
                right--;
            }
            else
            {
                ispalindrome=false;
                break;
            }
        }
        if(ispalindrome){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
           
        }
       
    }
}