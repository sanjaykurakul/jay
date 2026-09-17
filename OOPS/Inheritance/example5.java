import java.util.*;
class vehicle{
    void start(){
        System.out.println("Vechile Starts");
    }
}
class Car extends vehicle{
    void start(){
        System.out.println("Car starts with keys");
    }
}
public class example5{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Car c=new Car();
        c.start();
        vehicle v=new vehicle();
        v.start();
    }
}