import java.util.*;
public class primenumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1){
            System.out.println("not a prime number");
            return;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.println("not a prime number");
                return;
            }
        }
        System.out.println("prime number");
    }
}