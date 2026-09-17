import java.util.*;
public class factorial{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        long n=sc.nextLong();
        long fact=1;
        for(long i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}

//first priority is iterative approach than the recursive approach....
