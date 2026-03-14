import java.util.Scanner; // For input/output operations
import java.util.Arrays;

public class PracticeZone{
	public static void main(String[] args){
				Scanner sc = new Scanner(System.in);

				String[] people1 = {"Cole","JD","Arron","Jepax","Jake","Clyde","Reynel","Duu"};
				//String[] people2 = {"Joan","Jamaica","Izza","Sasha","Bossing","Kim","Bagasawe","Tomboys"};
				
				String[] newPeople = Arrays.copyOf(people1, 10);

				System.out.println(newPeople);

				for(int i = 0; i < newPeople.length;i++){
					if(newPeople[i] == null)
						System.out.println("Blank Space");
					else
						System.out.println(newPeople[i] + "");
				}

				sc.close();

	}
}