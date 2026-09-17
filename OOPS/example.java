import java.util.*;
class student{
    String name;
    int marks;
    void checkResult(){
        if(marks>=40){
            System.out.println(name + " pass");
        }
        else{
            System.out.println(name + " Fail");
        }

    }
}
    public class example{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            student s1=new student();
            s1.name=sc.nextLine();
            s1.marks=sc.nextInt();
            s1.checkResult();
        }
    }
