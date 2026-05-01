import java.util.Scanner; // For input/output operations

public class TwoDimensional{
	public static void main(String[] args){
		java.util.Scanner sc = new Scanner(System.in);

		// **** SUM OF ELEMENTS ****
		
		int sum = 0;
		int[][] arr = {{1,2,3},
					   {4,5,6},
					   {7,8,9}}; 

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				sum += arr[i][j];
			}
		}

		System.out.println("Sum: " + sum );
		
		
		// **** SUM OF ROWS OF EACH ROWS ****
		/*
		int[][] arr = {{1,2,3},
					   {4,5,6},
					   {7,8,9}}; 
		
		int[] rowSum = new int[arr.length];

		for(int i = 0; i < arr.length;i++){
			for(int j = 0; j < arr[i].length; j++){
				rowSum[i] += arr[i][j];
			}
			
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.println("Sum of row " + (i + 1) + ": " + rowSum[i]);
		}
		*/
		
		
		// **** FIND MIN AND MAX ****
		/*int[][] arr = {{9,2,3},
					   {4,5,6},
					   {7,8,1}}; 

		int min = arr[0][0];
		int max = arr[0][0];

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				if(arr[i][j] > max){
					max = arr[i][j];
				}
				if(arr[i][j] < min){
					min = arr[i][j];
				}	
			}
		}

		System.out.println(max);
		System.out.println(min);
		*/
		
		sc.close();
	}

	
}