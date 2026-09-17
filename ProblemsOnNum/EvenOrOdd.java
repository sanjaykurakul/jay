import java.util.*;
public class EvenOrOdd{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        // used Bit Operation & to reduce time complexity and optimal solution..
        // Also Ternaryoperator used
        System.out.println((n & 1) == 0 ? "Even" : "Odd");
   }
}