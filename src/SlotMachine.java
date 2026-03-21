import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class SlotMachine {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // VARIABLES
        
        String[] symbols = {"X", "Y", "Z", "T", "S"};
		String randomSymbol;
        String decision;
        int balance = 100;
        int bet;

        System.out.println("\n************************");
        System.out.println(" Welcome to Java Slots!");
        System.out.println(" Symbols: X  Y  Z  T  S");
        System.out.println("************************");
        
        do{
            if(balance > 0){
                String[] newSymbols = Arrays.copyOf(symbols,3);
                System.out.println("\nCurrent balance: $"+ balance);
                
                System.out.print("Place you bet amount: ");
                bet = sc.nextInt();

                System.out.print("\nSpinning");
                for(int i = 0; i < 4; i++){
                    Thread.sleep(700);
                    System.out.print(".");
                }

                System.out.println("\n**************");
                for(int i = 0; i < 3; i++){
                    randomSymbol = symbols[random.nextInt(symbols.length)];
                    System.out.print(" " + randomSymbol);
                    newSymbols[i] = randomSymbol;
                    if(i < 2){
                        System.out.print(" | " );
                    }      
                }
                System.out.println("\n**************");
                
                if(newSymbols[0].equals(newSymbols[1]) && newSymbols[1].equals(newSymbols[2])){
                    balance *= 2;
                    System.out.println("Jackpot!");
                }
                else if(newSymbols[0].equals(newSymbols[1]) || newSymbols[1].equals(newSymbols[2])){
                    balance += bet;
                    System.out.println("You won!");
                }
                else{
                    balance -= bet;
                    System.out.println("You lose!");
                }
            }
            else{
                System.out.println("\nCurrent balance: $"+ balance);
                System.out.println("You have no money left!");
                break;
            }
            
                System.out.print("Do want to play again? (y/n): ");
                decision = sc.next().toLowerCase();        
            
        }while(decision.equals("y"));

        if(balance > 100){
            System.out.println("\nFinal balance: " + balance);
            System.out.println("Profit: " + (balance - 100));
            System.out.println("Congrats on your winnings!");
        }
        else{
            System.out.println("\nFinal balance: " + balance);
            System.out.println("Loss: " + (100 - balance));
            System.out.println("Better luck next time!");
        }

        sc.close();
    }
}
