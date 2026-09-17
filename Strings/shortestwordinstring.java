import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int start = 0;

        int minLength = Integer.MAX_VALUE;
        String shortestWord = "";

        while(start < str.length())
        {
            int end = start;

            while(end < str.length() && str.charAt(end) != ' ')
            {
                end++;
            }

            int length = end - start;

            if(length < minLength)
            {
                minLength = length;
                shortestWord = str.substring(start, end);
            }

            start = end + 1;
        }

        System.out.println("Shortest Word: " + shortestWord);

        sc.close();
    }
}