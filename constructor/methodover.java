import java.util.*;

public class methodover{
    static int add(int a,int b){
        return a+b;
    }
    static int add(int x,int y,int c){
        return x+y+c;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=add(a,b);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int c=sc.nextInt();
        int repo=add(x,y,c);
        System.out.println(result);
        System.out.println(repo);
    }
}
