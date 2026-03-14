import java.util.Scanner; // For input/output operations

public class PracticeZone{
	public static void main(String[] args){
				Scanner sc = new Scanner(System.in);

				System.out.print("Enter # of rows: ");
				int rows = sc.nextInt();

				System.out.print("Enter # of columns: ");
				int col = sc.nextInt();

				System.out.print("Enter symbol: ");
				String symbol = sc.next();

				for(int i = 1; i <= rows; i++){
					for(int j = col; j >= i; j--){
						System.out.print(" ");
					}
					for(int k = 1; k <= i; k++){
						System.out.print(symbol + "");
					}
					for(int t = 1; t <= i;t++){
						if(t == 1)
							continue;
						else
							System.out.print(symbol + "");
					}
					System.out.println();
				}

				sc.close();

	}
}