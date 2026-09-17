import java.util.*;
class Student{
    private String name;
    private int marks;
    public void setName(String name){
        this.name=name;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Marks:"+marks);
    }
    
}
public class example{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        String name=sc.nextLine();
        int marks=sc.nextInt();
        s.setName(name);
        s.setMarks(marks);
        s.display();
    }
}