import java.util.*;
public class sumofnumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            sum=sum+digit;
         //System.out.print(sum);
        }
        System.out.println(sum);
    }
}