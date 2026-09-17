import java.util.*;
class person{
    String name;
    int marks;
    void displayPerson(){
        System.out.println("Name:"+name);
        System.out.println("Marks:"+marks);
    }
    }
    class student extends person{
        int age;
        void displayAge(){
            System.out.println("Age:"+age);
        }
    }

public class example{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        student s=new student();
         s.name=sc.nextLine();
        s.marks=sc.nextInt();
        s.age=sc.nextInt();
        //example e=new example();
        s.displayPerson();
        s.displayAge();
    }
}