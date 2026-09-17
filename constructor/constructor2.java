import java.util.*;
class employee{
    String name;
    double salary;
    employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("name:" +name);
        System.out.println("salary:" +salary );
    }
}
public class constructor2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        double salary=sc.nextDouble();
        employee e1 = new employee( name, salary);
        e1.display();
    }
}