import java.util.Scanner; // For input/output operations
import java.util.Arrays;

public class PracticeZone{
	public static void main(String[] args){
				Scanner sc = new Scanner(System.in);

				int[] scores = {150, 0, 200, 150, 75, 0, 300, 200};
				int[] newScores = new int[scores.length];

				int j = 0;

				for(int i = 0; i < scores.length; i++){
					if(scores[i] == 0)
						continue;			
					else
						newScores[j++] = scores[i];
				}

				newScores = Arrays.copyOf(newScores,6);
				Arrays.sort(newScores);

				for(int elements : newScores){
					System.out.println(elements);
				}

				/*for(int i = 0; i < scores.length; i++){
					for(int j = 0; j < scores.length - 1; j++){
						if(scores[i] == scores[j + 1]){
							newScores[i] = scores[i];
						}
					}
				

				for(int elements : newScores)		
					System.out.println(elements);
				}*/

				sc.close();
	}
}