import java.util.Scanner;

public class reversestringinword
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int start = 0;

        while(start < str.length())
        {
            int end = start;

            while(end < str.length() && str.charAt(end) != ' ')
            {
                end++;
            }

            for(int i = end - 1; i >= start; i--)
            {
                System.out.print(str.charAt(i));
            }

            if(end < str.length())
            {
                System.out.print(" ");
            }

            start = end + 1;
        }

        sc.close();
    }
}