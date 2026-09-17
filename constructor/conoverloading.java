import java.util.*;
class employee{
    String name;
    int salary;
    employee(){
        name="unknown";
        salary=0;
    }
    employee(String name){
        this.name=name;
        salary=0;
    }
    employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("salary:"+salary);
    }
}
public class conoverloading{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int salary=sc.nextInt();
        employee e1=new employee(name,salary);
        employee e2=new employee(name);
        employee e3=new employee();
        e1.display();
        e2.display();
        e3.display();

    }
}