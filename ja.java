import java.util.*;
public class ja{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String[]input=sc.nextLine().trim().split("\\s+");
        int max=Integer.MIN_VALUE;
        /*for(String s:input){
            int num=Integer.parseInt(s);
            if(num>max){
                max=num;
            }
        }*/
        for(int i = 0; i < input.length; i++){
        String s = input[i];              // manually grab each element
        int num = Integer.parseInt(s);
        if(num > max)
        {
            max = num;
        }
    }
    System.out.print(max);

    }
}