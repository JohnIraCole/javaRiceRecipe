import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // VARIABLES
        String playerMove;
        String[] computerMove = {"rock", "paper", "scissors"};
        int randomMove;
        String playerChoice;
        // LOOP
        do{
            // MOVE
            System.out.print("\nEnter your move (rock, paper, scissors): ");
            playerMove = sc.next().toLowerCase();

            // COMPUTER MOVE
            randomMove = random.nextInt(0,3);
            System.out.println("Computer move: " + computerMove[randomMove]);

            // CHECK MOVES
            if(playerMove.equals("rock")){
                if(computerMove[randomMove].equals("scissors")){
                    System.out.println("You Win!");
                }
                else if(computerMove[randomMove].equals("paper")){
                    System.out.println("You Lose!");
                }
                else{
                    System.out.println("It's a Draw!");
                 }
            }

            else if(playerMove.equals("paper")){
                if(computerMove[randomMove].equals("rock")){
                    System.out.println("You Win!");
                }
                else if(computerMove[randomMove].equals("scissors")){
                    System.out.println("You Lose!");
                }
                else{
                    System.out.println("It's a Draw!");
                }
            }

            else if(playerMove.equals("scissors")){
                if(computerMove[randomMove].equals("paper")){
                    System.out.println("You Win!");
                }
                else if(computerMove[randomMove].equals("rock")){
                    System.out.println("You Lose!");
                }
                else{
                    System.out.println("It's a Draw!");
                }
            }
            else
                System.out.println("Please enter valid move.");

            System.out.print("Play again? (yes/no): ");
            playerChoice = sc.next().toLowerCase();

            // ASK TO PLAY AGAIN
        }while(playerChoice.equals("yes"));
            
        sc.close();         
            
    }
}
