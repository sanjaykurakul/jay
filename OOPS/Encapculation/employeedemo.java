import java.util.*;
class Employee{
    private String name;
    private int salary;
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(int salary){
        if(salary>0){
            this.salary=salary;
        }
        else{
            System.out.println("Invalid Entry");
        }
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
    }
}
public class employeedemo{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int salary=sc.nextInt();
        Employee e=new Employee();
        e.setName( name);
        e.setSalary(salary);
        e.display();
    }
}