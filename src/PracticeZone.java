import java.util.Scanner; // For input/output operations
import java.util.Arrays;
import java.util.Random;
public class PracticeZone{
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		String[] symbols = {"X", "Y", "Z", "T", "S"};
		String randomSymbol;


         String[] newSymbols = Arrays.copyOf(symbols,3);

           System.out.print("Spinning");
           for(int i = 0; i < 4; i++){
               Thread.sleep(700);
               System.out.print(".");
            }

            System.out.println("\n**************");
            for(int i = 0; i < 3; i++){
                randomSymbol = symbols[random.nextInt(symbols.length)];
                System.out.print(" " + randomSymbol);
                if(i < 2)
                    System.out.print(" | " );
                else
                    continue;

                newSymbols[i] = randomSymbol;
            }
			System.out.println("\n**************");

			for(String elements: newSymbols)
				System.out.print(elements);


		
		sc.close();
	}
}