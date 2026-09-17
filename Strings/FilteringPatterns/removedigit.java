//Removing Digit in the String..

import java.util.*;
public class removedigit{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!(ch >= '0' && ch <= '9'))  //if(!Character.isDigit(ch))
            {
                ans.append(ch);
            }

        }
        System.out.print(ans);
    }
}