import java.util.*;
public class multiplyandadd{
    static int multiply(int n){
        return n*2;
    }
    static int addandmultiply(int a,int b){
        return multiply(a) + multiply(b);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=addandmultiply(a,b);
        System.out.println(result);
    }
}