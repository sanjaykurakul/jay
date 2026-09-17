import java.util.*;
public class minfreqchar{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int freq[]=new int[256];
        for(int i=0;i<s.length();i++ ){
            char c=s.charAt(i);
            freq[c]++;
        }
        boolean visited[]=new boolean[256];
        boolean found=true;
        int minFreq = Integer.MAX_VALUE;  //important..
        char answer='\0';
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!visited[c]){
                if(freq[c]<minFreq){
                    minFreq=freq[c];
                    answer=c;
                }
                visited[c]=true;
            }
        }
        System.out.println(answer +"--> "+ minFreq);
    }
}