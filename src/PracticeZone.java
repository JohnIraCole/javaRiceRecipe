import java.util.Scanner; // For input/output operations

public class PracticeZone{
	public static void main(String[] args){
		java.util.Scanner sc = new Scanner(System.in);

		
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		int[][] arr = {{1,2,3},
					   {4,5,6},
					   {7,8,9}}; 
		
		for(int i = 0; i < arr.length;i++){
			for(int j = 0; j < arr[i].length; j++){
				if(arr[i] == arr[0]){
					sum1 += arr[i][j];
				}
				else if(arr[i] == arr[1]){
					sum2 += arr[i][j];
				}
				else{
					sum3 += arr[i][j];
				}
			}
			
		}
		System.out.println("Sum of first array: " + sum1);
		System.out.println("Sum of second array: " + sum2);
		System.out.println("Sum of third array: " + sum3);

		sc.close();
	}

	
}