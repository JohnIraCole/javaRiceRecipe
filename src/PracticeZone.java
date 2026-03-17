import java.util.Scanner; // For input/output operations

public class PracticeZone{
	public static void main(String[] args){
				Scanner sc = new Scanner(System.in);

				double[] scoreArr = new double[5];

				for(int i = 0; i < 5; i++){
					System.out.print("Enter score #" + (i + 1)+ ": ");
					double score = sc.nextDouble();
					scoreArr[i] = score;
				}

				System.out.println("Avarege score: " + average(scoreArr));

				sc.close();
	}
	static double average(double... number){
		double res = 0;

		for(double numbers: number){
			res += numbers;
		}

		return res / number.length;
	}
}