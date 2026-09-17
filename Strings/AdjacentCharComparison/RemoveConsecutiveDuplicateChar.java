/*
1. Concept-->
Remove only adjacent (consecutive) duplicate characters.
Do not remove duplicates that appear later in the string.
Example 1
Input:
aaabbccdaa
Output:
abcda*/
import java.util.*;
public class RemoveConsecutiveDuplicateChar{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.length()==0){
            System.out.print("");
            return;
        }
        StringBuilder ans=new StringBuilder();
        ans.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char current = s.charAt(i);
            char previous = s.charAt(i - 1);

            if(current != previous)
            {
                ans.append(current);
            }
        }

        System.out.println(ans);
        }

    }
