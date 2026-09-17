/*
Reverse Order of Words-->
Input
Java is awesome
Output
awesome is Java
The words move.
The letters inside each word remain unchanged.*/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int i = str.length() - 1;

        while(i >= 0)
        {
            while(i >= 0 && str.charAt(i) == ' ')
            {
                i--;
            }

            if(i < 0)
            {
                break;
            }

            int end = i;

            while(i >= 0 && str.charAt(i) != ' ')
            {
                i--;
            }

            int start = i + 1;

            for(int j = start; j <= end; j++)
            {
                System.out.print(str.charAt(j));
            }

            if(i > 0)
            {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}