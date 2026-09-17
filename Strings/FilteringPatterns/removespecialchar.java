import java.util.*;
public class removespecialchar{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder ans =new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((Character.isLetter(ch)|| Character.isDigit(ch) ))
            {
                ans.append(ch);
            }

        }
        System.out.println(ans);
    }
}