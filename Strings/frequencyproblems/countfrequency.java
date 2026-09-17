import java.util.Scanner;
public class Main
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
        boolean[] visited = new boolean[256];
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(!visited[ch])
            {
                System.out.println(ch + " -> " + freq[ch]);
                visited[ch] = true;
            }
        }
        sc.close();
    }
}