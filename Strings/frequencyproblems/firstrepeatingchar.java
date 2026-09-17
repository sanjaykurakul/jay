import java.util.*;
public class firstrepeatingchar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[256];
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            freq[ch]++;
        }
        boolean found = false;
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(freq[ch] > 1)
            {
                System.out.println("First Repeating Character: " + ch);
                found = true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("No Repeating Character");
        }
    }
}