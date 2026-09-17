/* Problem Statement:
Given a sentence,
reverse the order of words.
Remove unnecessary spaces.
Example:
Input:
I Love Programming
Output:
Programming Love I
*/
import java.util.*;
public class wordreverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim(); //trim()-->Removes leading and trailing spaces.
        String[] words = s.split("\\s+"); //split("\\s+")-->Creates an array of words.
        StringBuilder ans = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--) //Traverse backwards...
        {
            ans.append(words[i]);
            if(i != 0) //Add a space only between words.
            {
                ans.append(" ");
            }
        }
        System.out.println(ans);
        sc.close();
    }
}