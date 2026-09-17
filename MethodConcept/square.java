import java.util.*;
public class square{
    static int square(int n){
        return n*n;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=square(n);          // calling method using square(n)......
        System.out.println(result);
    }
}