import java.util.Scanner;

public class longestwordinstring
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int start = 0;

        int maxLength = 0;
        String longestWord = "";

        while(start < str.length())
        {
            int end = start;

            while(end < str.length() && str.charAt(end) != ' ')
            {
                end++;
            }

            int length = end - start;

            if(length > maxLength)
            {
                maxLength = length;
                longestWord = str.substring(start, end);
            }

            start = end + 1;
        }

        System.out.println("Longest Word: " + longestWord);

        sc.close();
    }
}