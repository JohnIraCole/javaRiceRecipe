import java.util.Scanner;

public class Inheritance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        dog.display();
        cat.display();

        sc.close();
    }
}
// GRANDPARENT

 // PARENT
class Animal{

    boolean isAlive = true;

    void display(){
        System.out.println("This animal is alive: " + isAlive);
    }
}

// CHILD
class Dog extends Animal{

}

class Cat extends Animal{

}