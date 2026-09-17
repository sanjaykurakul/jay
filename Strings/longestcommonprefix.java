/*
Longest Common Prefix-->
Example:
flower
flow
flight
Output:
fl
*/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextLine();
        }

        String first = arr[0];
        StringBuilder prefix = new StringBuilder();

        for(int i = 0; i < first.length(); i++)
        {
            char ch = first.charAt(i);

            boolean match = true;

            for(int j = 1; j < n; j++)
            {
                if(i >= arr[j].length() || arr[j].charAt(i) != ch)
                {
                    match = false;
                    break;
                }
            }

            if(match)
            {
                prefix.append(ch);
            }
            else
            {
                break;
            }
        }

        System.out.println("Longest Common Prefix: " + prefix);

        sc.close();
    }
}