import java.util.*;
class Student{
    String name;
    int roll;
    void display(){
        System.out.println(name);
        System.out.println(roll);
    }
}
    public class main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        s.name="dev";
        s.roll=101;
        s.display();
    }
}