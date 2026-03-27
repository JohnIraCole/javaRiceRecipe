import java.util.Scanner;

public class Inheritance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Dog dog = new Dog("Shitzu");
        Cat cat = new Cat("Persian");

        Animal[] types = {dog,cat};

        for(Animal elements : types){
            System.out.println(elements.speciesName);
            elements.sound();    
        }

        sc.close();
    }
}
// GRANDPARENT
class Organisms{
    String speciesName;

    Organisms(String name){
        this.speciesName = name;
    }

    void showSpecies(){
        System.out.println("I am a " + speciesName);
    }
}

 // PARENTS
class Plants extends Organisms{

    Plants(String name){
        super(name);
    }

    void photosynthesized(){
        System.out.println("The plant is getting energy from the sun.");
    }

}

abstract class Animal extends Organisms{

    Animal(String name){
        super(name);
    }

    void move(){
        System.out.println("The animal walks");
    }

    abstract void sound();
    
}

// CHILD
class Dog extends Animal{
    int lives = 1;

    Dog(String name){
        super(name);
    }

    void sound(){
        System.out.println("The dog barks");
    }
}

class Cat extends Animal{
    int lives = 9;

    Cat(String name){
        super(name);
    }

    void sound(){
        System.out.println("The cat meowed");
    }

    @Override
    void move(){
        super.move();
        System.out.println("The cat leaps gracefully");
    }
}