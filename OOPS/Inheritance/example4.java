import java.util.*;
class Animal{
    void Sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void Sound(){
        super.Sound();
        System.out.println("Dog sounds Bow");
    }
}
public class example4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Dog d=new Dog();
        d.Sound();
    }
}


//Super used in method overriding