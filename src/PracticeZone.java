import java.util.Scanner;
public class PracticeZone{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;
        String adjective4;

        System.out.println("Enter an adjective: ");
        adjective1 = sc.nextLine();      
        System.out.println("Enter a noun: ");
        noun1 = sc.nextLine();
        System.out.println("Enter an adjective: ");
        adjective2 = sc.nextLine();
        System.out.println("Enter a verb ");
        verb1 = sc.nextLine();
        System.out.println("Enter an adjective: ");
        adjective3 = sc.nextLine();
        System.out.println("Enter an adjective: ");
        adjective4 = sc.nextLine();

        
        System.out.println("Today I went to my" + adjective1 + " school.");
        System.out.println("On the way to my class I saw " + noun1 + "and his " + adjective2 +" face.");
        System.out.println("He was " + verb1 + " at me then said something " + adjective3 + ".");
        System.out.println("I was " + adjective4 + " with what he said.");


        sc.close();
    }
}