import java.util.Scanner; // For input/output operations

public class PracticeZone{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		Student student1 = new Student("Cole","Male",19,241440626,true,"08-16-2024", 4.8);
		Student student2 = new Student("Espejon","Female",20,241351620,true,"08-17-2024", 4.3);
		Student student3 = new Student("Jake","Male",22,235050332,true,"05-07-2023", 4.5);
		Student student4 = new Student("Geralde","Female",19,242340633,false,"08-16-2024", 5.0);
		
		student1.display();
		student2.display();
		student3.display();
		student4.display();
		sc.close();
	}
}

class Student{

	String studName;
	String gender;
	int age;
	int studId;
	String dateEnrolled;
	boolean isEnrolled;
	double gpa;
	
	Student(String name,String gender, int age, int id, boolean enrolled, String dateEnrolled,double gpa){
		this.studName = name;
		this.gender = gender;
		this.age = age;
		this.studId = id;
		this.isEnrolled = enrolled;
		this.dateEnrolled = dateEnrolled;
		this.gpa = gpa;
	}

	void display(){
		System.out.println("Name of student: " + this.studName);
		System.out.println("Gender: " + this.gender);
		System.out.println("Age: " + this.age );
		if(this.isEnrolled){
			System.out.println("Id: " + this.studId);
			System.out.println("Enrolled: " + this.isEnrolled);
			System.out.println("Date enrolled: " + this.dateEnrolled);
			System.out.println("GPA: " + this.gpa);
		}
		else{
			System.out.println("Enrolled: " + this.isEnrolled);
			System.out.println("You are not enrolled!");
		}
		System.out.println();
	}
}
