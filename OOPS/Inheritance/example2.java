import java.util.*;
class Employee{
    String name;
    int salary;
    void displayEmployee(){
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
    }
}
class Manager extends Employee{
    int teamsize;
    void displayManagerTeamsize(){
        System.out.println("TeamSize:"+teamsize);
    }
}
public class example2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Manager m=new Manager();
        m.name=sc.nextLine();
        m.salary=sc.nextInt();
        m.teamsize=sc.nextInt();
        m.displayEmployee();
        m.displayManagerTeamsize();

    }
}