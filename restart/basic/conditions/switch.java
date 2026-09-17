import java.util.*;
public class Switch{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        //int day = 2;

switch(day) {

    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Invalid");
}
    }
}