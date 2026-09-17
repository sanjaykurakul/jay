import java.util.*;
class Animal{
    void Sound(){
        System.out.println("Animal makaes sound");
    }
}
class Dog extends Animal{
    void Sound(){
        System.out.println("Dog makes sound bow");
    }
} 
class cat extends Dog{
    void Sound(){
        System.out.println("Cat makes meow");
    }
}
public class override{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        cat c=new cat();
        Dog d=new Dog();
        c.Sound();
        d.Sound();
    }
}