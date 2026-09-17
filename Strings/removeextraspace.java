import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder ans = new StringBuilder();

        int i = 0;

        // Skip leading spaces
        while(i < str.length() && str.charAt(i) == ' ')
        {
            i++;
        }

        while(i < str.length())
        {
            char ch = str.charAt(i);

            if(ch != ' ')
            {
                ans.append(ch);
            }
            else
            {
                if(ans.length() > 0 && ans.charAt(ans.length() - 1) != ' ')
                {
                    ans.append(' ');
                }
            }

            i++;
        }

        // Remove trailing space
        if(ans.length() > 0 && ans.charAt(ans.length() - 1) == ' ')
        {
            ans.deleteCharAt(ans.length() - 1);
        }

        System.out.println(ans);

        sc.close();
    }
}