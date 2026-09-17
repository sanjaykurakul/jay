//Sum of Numbers in a Given Range
//given input: 1 5
//computation:1+2+3+4+5
// output:15..
import java.util.*;
public class SumOfNumRange{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long start = sc.nextLong();
        long end = sc.nextLong();
        // Here used Arithmetic Progression formula:
        long count=end-start + 1;
        long sum=count*(start+end)/2;
        
        System.out.println(sum);

    }
}