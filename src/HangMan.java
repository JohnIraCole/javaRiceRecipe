import java.util.Scanner;
import java.util.ArrayList;

public class HangMan {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<Character>();  
        String word = "apple";
        int wrongGuesses = 0;
        for(int i = 0; i < word.length(); i++){
                wordState.add('_');
            }
        
        gameTitle();

        System.out.println("INSTRUCTIONS:   The goal of this game is to save the man from hanging!");
        System.out.println("\t\tIf you fail to guess the word within 6 attempts the man will perish!");
        System.out.println("\t\tSo be cautious with your decisions and think carefully.");


        while(wrongGuesses < 6){
            System.out.println(displayHangMan(wrongGuesses));
            System.out.print("Word: ");
            for(char elements : wordState){
                System.out.print(elements + " ");
            }
            System.out.println();

            System.out.print("Guess: ");
            char guess = sc.next().toLowerCase().charAt(0);

            if(word.indexOf(guess) >= 0){
                System.out.println("Correct guess!\n");
                for(int i = 0; i < word.length(); i++){
                    if(word.charAt(i) == guess){
                        wordState.set(i , guess);
                    }
                }
                if(!wordState.contains('_')){
                    System.out.println(displayHangMan(wrongGuesses));
                    System.out.println("YOU WIN!");
                    System.out.println("The word was: " + word);
                    break;
                }
            }

            else{
                wrongGuesses++;
                System.out.println("Wrong guess!\n"); 
            }
        };

        if(wrongGuesses >= 6){
              System.out.println(displayHangMan(wrongGuesses));
            System.out.println("GAME OVER!");
            System.out.println("The word was: " + word);
        }
      
        

        sc.close();
        
    }

    static void gameTitle(){
        System.out.println("\n\n\n\n");
        System.out.println("██╗  ██╗ █████╗ ███╗   ██╗ ██████╗ ███╗   ███╗ █████╗ ███╗   ██╗");
        System.out.println("██║  ██║██╔══██╗████╗  ██║██╔════╝ ████╗ ████║██╔══██╗████╗  ██║");
        System.out.println("███████║███████║██╔██╗ ██║██║  ███╗██╔████╔██║███████║██╔██╗ ██║");
        System.out.println("██╔══██║██╔══██║██║╚██╗██║██║   ██║██║╚██╔╝██║██╔══██║██║╚██╗██║");
        System.out.println("██║  ██║██║  ██║██║ ╚████║╚██████╔╝██║ ╚═╝ ██║██║  ██║██║ ╚████║");
        System.out.println("╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝");
        System.out.println("\n");
    }

    static String displayHangMan(int wrongGuesses){
        return switch(wrongGuesses){
           case 0 -> """
                     +---+
                     |   |
                     |   
                     |  
                     |  
                     |
                    =========""";
            
            case 1 -> """
                     +---+
                     |   |
                     |   O
                     |  
                     |  
                     |
                    =========""";

            case 2 -> """
                     +---+
                     |   |
                     |   O
                     |   |
                     |  
                     |
                    =========""";

            case 3 -> """
                     +---+
                     |   |
                     |   O
                     |  /|
                     |  
                     |
                    =========""";
            
            case 4 -> """
                     +---+
                     |   |
                     |   O
                     |  /|\\
                     |  
                     |
                    =========""";
            
             case 5 -> """
                     +---+
                     |   |
                     |   O
                     |  /|\\
                     |  / 
                     |
                    =========""";

             case 6 -> """
                     +---+
                     |   |
                     |   O
                     |  /|\\
                     |  / \\
                     |
                    =========""";
            default -> "";
        };
    }
}
