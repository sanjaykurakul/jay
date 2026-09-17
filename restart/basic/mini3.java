import java.util.*;
public class mini3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%3==0 && a%5==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}