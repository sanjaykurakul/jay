import java.util.*;
public class nested{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("pin: ");
        int pin=sc.nextInt();
        //System.out.println("pin: ");
        int amount=sc.nextInt();
        int balance=9000;
        if(pin==9032){
            if(amount<=balance){
                System.out.println("Transaction Successful");
            }
            else{
                System.out.println("Insufficient Balance");
            }

        }
        else{
            System.out.println("Invalid Pin");
        }
    }
}