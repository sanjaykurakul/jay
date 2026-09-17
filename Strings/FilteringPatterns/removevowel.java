import java.util.*;
public class removevowel{
   /* public static boolean isVowel(char ch)
    {
        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }*/
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!(ch == 'a' || ch == 'e' || ch == 'i' ||              //if(!isVowel(ch))-->optimised way..
                 ch == 'o' || ch == 'u' || ch == 'A' || 
                 ch == 'E' || ch == 'I' || ch == 'O' ||
                 ch == 'U'))
            {
                ans.append(ch);
            }
        }
        System.out.print(ans);

    }
}