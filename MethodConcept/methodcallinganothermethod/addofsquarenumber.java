import java.util.*;
public class addofsquarenumber{
    static int square(int n){
        return n*n;
    }
    static int squareofnumber(int a,int b){
       return square(a)+square(b);

    }
    //return squareofnumber();

public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int result=squareofnumber(a,b);
    System.out.println(result);

}
}