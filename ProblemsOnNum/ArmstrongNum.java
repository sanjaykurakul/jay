import java.util.*;
class ArmstrongNum
{
    static int count(int n)
    {
        int c = 0;
        while(n > 0)
        {
            n = n / 10;
            c++;
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int p = count(n);
        int rem = 0,arm = 0;
        while(n > 0)
        {
            rem = n % 10;
            arm += (Math.pow(rem,p));
            n = n / 10;
        }
        System.out.println(arm);
    }
}