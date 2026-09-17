/*1. Concept-->
A word is a sequence of characters separated by one or more spaces.
Example:
Java is awesome
Words:
Java
is
awesome
Total:
3*/
import java.util.Scanner;
public class countwordsinstring
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) != ' ' &&
              (i == 0 || str.charAt(i - 1) == ' '))
            {
                count++;
            }
        }
        System.out.println("Number of Words: " + count);
        sc.close();
    }
}