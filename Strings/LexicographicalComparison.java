import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int minLength = Math.min(str1.length(), str2.length());

        for(int i = 0; i < minLength; i++)
        {
            if(str1.charAt(i) < str2.charAt(i))
            {
                System.out.println("First String is Smaller");
                return;
            }
            else if(str1.charAt(i) > str2.charAt(i))
            {
                System.out.println("Second String is Smaller");
                return;
            }
        }

        if(str1.length() == str2.length())
        {
            System.out.println("Equal");
        }
        else if(str1.length() < str2.length())
        {
            System.out.println("First String is Smaller");
        }
        else
        {
            System.out.println("Second String is Smaller");
        }

        sc.close();
    }
}