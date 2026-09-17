import java.util.*;
public class reversestring{
    static String reverse(String s){
         String rev = "";
         for (int i = s.length() - 1; i >= 0; i--) {
        rev = rev + s.charAt(i);
    }

    return rev;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String result=reverse(st);
        System.out.println(result);
    }
}