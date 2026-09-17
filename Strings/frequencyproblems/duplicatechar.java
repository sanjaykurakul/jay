import java.util.*;
public class duplicatechar{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int freq[]=new int[256];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c]++;
        }
        boolean visited[]=new boolean[256];
        boolean found=true;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(freq[c]>1 && !visited[c]){
                System.out.println(c +" -->"+freq[c]);
                visited[c]=true;
                found=true;
            }
        }
        if(!found){
            System.out.print("Duplicates not found");
        }
    }
}