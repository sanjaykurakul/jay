import java.util.*;

class Employee {
    String name;
    int salary;
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Employee Constructor");
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee {
    String department;
    Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
        System.out.println("Manager Constructor");
    }
    void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}
public class example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter salary: ");
        int salary = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter department: ");
        String department = sc.nextLine();
        Manager m = new Manager(name, salary, department);  
        m.display();
    }
}