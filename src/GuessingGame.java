import java.util.Scanner; // For input/output operations 
import java.util.Random; // Generates random values of each data type

public class GuessingGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(1,11); // Range of the number that we want to guess.
        int numGuesses = 5;

        System.out.print("\nDo you wanna play a game(Yes/No): ");
        String question = sc.nextLine(); question = question.toUpperCase(); 
        // Converts string to all caps incase user inputs small caps.

        if(question.equals("YES")){
            System.out.println("Great I want you to guess a number between 1 - 10: ");
            System.out.println("If you can guess the number before running out of guesses I'll give you a reward.");

                while(numGuesses != 0){
                    System.out.print("\nGuess: ");
                    int guess = sc.nextInt();
                    if(guess != randomNumber){
                        numGuesses--;
                        System.out.println("Wrong guess, Try again!");
                        System.out.println("You have " + numGuesses + " guesses remaining.");
                    }                        
                    else{
                        System.out.println("You guessed the number!");
                        System.out.println("As a reward here's $1,000,000");
                        System.out.println("Thank you for playing <3");
                        break;
                    }
                }
                if(numGuesses == 0){
                        System.out.println("\nYou ran out of guesses");
                        System.out.println("Skill issue fr.");
                }
                sc.close(); // Note: don't put the close method inside the loop.
        }
        else{
            System.out.println("\nAwe too bad :(");
        }
        
    }
}