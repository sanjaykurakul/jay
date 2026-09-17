/*1. Concept
A string is called a rotation of another string if we can move some characters from the front to the back while preserving their order.
Example
ABCD
Rotate once
BCDA
Rotate again
CDAB
Rotate again
DABC
Rotate again
ABCD
All of these are valid rotations.
*/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if(str1.length() != str2.length())
        {
            System.out.println("Not Rotation");
            return;
        }

        String doubled = str1 + str1;

        if(doubled.contains(str2))
        {
            System.out.println("Rotation");
        }
        else
        {
            System.out.println("Not Rotation");
        }

        sc.close();
    }
}