public class Interface {
    public static void main(String[] args){
        Fish fish = new Fish();

        fish.hunt();
        fish.flee();
    }
}

interface Prey {
    void flee();
}

interface Predator{
    void hunt();
}

class Fish implements Prey,Predator {
    @Override
    public void hunt() {
        System.out.println("The fish can flee");
    }
    @Override
    public void flee(){
        System.out.println("The fish can hunt");
    }
}