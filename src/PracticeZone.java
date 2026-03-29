import java.util.Scanner; // For input/output operations

public class PracticeZone{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Student s = new Student("Cole","24-1440-626", 4.5);
		
		System.out.println(s);
		sc.close();
	}
}

class Student{

	String name;
	String id;
	double gpa;

	Student(String name, String id, double gpa){
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}

	@Override
	public String toString(){
		return this.name + " " + this.id + " " + gpa; 
	}
}

