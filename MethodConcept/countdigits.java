import java.util.*;
public class countdigits{
    static int Countdigits(int n){
        int count=0;
        if(n==0){
            return 1;
        }
        while(n>0){
            n=n/10;
            count++;

        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=Countdigits(n);
        System.out.println(result);
    }
}