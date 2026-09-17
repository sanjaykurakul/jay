import java.util.*;
public class validpalindrome{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int left=0;
        int right=s.length()-1;
        boolean ispalindrome=true;
        while(left<right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left)))
            {
                left++;
            }

            while(left < right && !Character.isLetterOrDigit(s.charAt(right)))
            {
                right--;
            }
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));

            if(leftChar != rightChar)
            {
                ispalindrome = false;
                break;
            }

            left++;
            right--;


            }
            if(ispalindrome){
                System.out.println("valid palindrome");
            }
            else{
                System.out.print("Invalid Palindrome");
            }
        }

    }
