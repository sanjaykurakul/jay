import java.util.*;
public class greatestofthree{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
// First Math.max(b,c) works then it return weather b is greater or c.. the result will compare with Math.max(a)..
        System.out.println(Math.max(a,(Math.max(b,c))));
    }
}