//First Non-Repeating Character
import java.util.*;
public class firstnonrepeatchar{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int freq[]=new int[256];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c]++;
        }
        boolean found=false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(freq[c]==1){
                System.out.println("First non repeating char:" + c);
                found=true;
                break;
            }
        }
            if(!found){
                System.out.println("No non repeating char");
            }

        
    }
}