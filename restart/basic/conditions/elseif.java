import java.util.*;
public class elseif{
    public static void main(String[]args){                                           
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=60){
            System.out.println("Senior Citizens");
        }
        else if(age>=20 && age<=59){
            System.out.println("Adult");
        }
        else if(age>=13 && age<=19){
            System.out.println("Teenagers");
        }
        else{
            System.out.println("Child");
        }
    }
}