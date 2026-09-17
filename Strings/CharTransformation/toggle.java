import java.util.Scanner;

public class toggle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch))
            {
                ans.append(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch))
            {
                ans.append(Character.toUpperCase(ch));
            }
            else
            {
                ans.append(ch);
            }
        }

        System.out.println(ans);

        sc.close();
    }
}