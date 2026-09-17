import java.util.*;
class student{
    String name;
    int marks;
    student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    void checkResult(){
        if(marks >=40){
            System.out.println(name +" pass");
        }
        else{
            System.out.println(name +" fail");
        }
    }
}
public class constructor1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int marks=sc.nextInt();
        student s1=new student(name,marks);
        s1.checkResult();
    }
}