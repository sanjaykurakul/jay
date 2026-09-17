import java.util.*;
class Animal{
    String name;
    int age;
    void displayAnimal(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
class Dog extends Animal{
    String dog;
    void displayDog(){
        System.out.println("Bark:"+dog);
    }
}
class Cat extends Dog{
    String cat;
    void displayCat(){
        System.out.println("Meow:"+cat);
    }
}
public class example1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Cat c=new Cat();
        c.name=sc.nextLine();
        c.age=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter dog sound: ");
        c.dog=sc.nextLine();
        c.displayAnimal();
        c.displayDog();
        c.displayCat();
    }
}