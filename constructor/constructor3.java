import java.util.*;
class bank{
    String name;
    int money;
    bank(String name,int money){
        this.name=name;
        this.money=money;
    }
    void Statement(){
        if(money>=1000){
            System.out.println(name+" Eligible to Withdraw");

        }
        else{
            System.out.println(name+" Not Eligible");
        }
    }
}
public class constructor3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int money=sc.nextInt();
        bank b1=new bank(name,money);
        b1.Statement();

    }
}