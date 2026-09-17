import java.util.*;
public class vowels{
    static int countVowels(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            count++;
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int result=countVowels(st);
        System.out.println(result);
    }
}