import java.util.*;
public class reverse{
    static int Reverse(int n){
        int reverse=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            reverse=reverse*10+digit;
        }
        return reverse;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=Reverse(n);
        System.out.println(result);
    }
}

