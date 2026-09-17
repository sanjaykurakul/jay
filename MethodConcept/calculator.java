import java.util.*;
public class calculator{
    static int add(int a,int b){
        return a+b;
    }
    static void display(int result){
        System.out.println("Result = " + result);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=add(a,b);
        display(result);
    }
}