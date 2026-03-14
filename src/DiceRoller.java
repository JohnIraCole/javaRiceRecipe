import java.util.Scanner;
import java.util.Random;
public class DiceRoller{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int i = 1;
        int total = 0;

        System.out.print("Enter number times you're gonna roll: ");
        int number = sc.nextInt();
        
        while(i <= number){
            int randomNumber = random.nextInt(1,7);
            diceASCII(randomNumber);
            total += randomNumber;
            i++;
        }

        System.out.println("Total of all rolls: " + total);
        
        
        sc.close();
    }
    public static void diceASCII(int num){
        switch(num){
            case 1 ->{
                System.out.println(" ------- ");
                System.out.println("|       |");
                System.out.println("|   ●   |");
                System.out.println("|       |");
                System.out.println(" ------- ");
                System.out.println("You rolled: 1");
            }
            case 2 ->{
                System.out.println(" ------- ");
                System.out.println("| ●     |");
                System.out.println("|       |");
                System.out.println("|     ● |");
                System.out.println(" ------- ");
                System.out.println("You rolled: 2");
            }
            case 3 ->{
                System.out.println(" ------- ");
                System.out.println("| ●     |");
                System.out.println("|   ●   |");
                System.out.println("|     ● |");
                System.out.println(" ------- ");
                System.out.println("You rolled: 3");
            }
            case 4 ->{
                System.out.println(" ------- ");
                System.out.println("| ●   ● |");
                System.out.println("|       |");
                System.out.println("| ●   ● |");
                System.out.println(" ------- ");
                System.out.println("You rolled: 4");
            }
            case 5 ->{
                System.out.println(" ------- ");
                System.out.println("| ●   ● |");
                System.out.println("|   ●   |");
                System.out.println("| ●   ● |");
                System.out.println(" ------- ");
                System.out.println("You rolled: 5");
            }
            case 6 ->{
                System.out.println(" ------- ");
                System.out.println("| ●   ● |");
                System.out.println("| ●   ● |");
                System.out.println("| ●   ● |");
                System.out.println(" ------- ");
                System.out.println("You rolled: 6");
            }
            default -> System.out.println("Enter valid number");
            
        }
    }
}