import java.util.*;
public class methodoverloadingex{
    static int calculate(int a,int b){
        return a + b;
    }
    static int calculate(int a,int b,int c){
        return a + b + c;
    }
    static double calculate(double x,double y){
        return x + y;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        int result1 = calculate(a, b);
        int result2 = calculate(a, b, c);
        double result3 = calculate(x, y);

        System.out.println("Result 1 = " + result1);
        System.out.println("Result 2 = " + result2);
        System.out.println("Result 3 = " + result3);
    }
}