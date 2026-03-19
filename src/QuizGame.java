import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] questions = {"1. What is Java mainly used for?",  //Answer: B
                              "2. Which of these is a primitive data type?", //Answer: C
                              "3. What does JVM stand for?", //Answer: B
                              "4. Which keyword is used to create a class?", //Answer: C
                              "5. What is the default value of an int (instance variable)?"}; //Answer: C
                              

        String[][] options = {{"A. Styling webpages", "B. Building application", "C. Managing databases only", "D. Designing hardware"},
                              {"A. String", "B. Array", "C. int", "D. Class"},
                              {"A. Java Variable Method", "B. Java Virtual Machine", "C. Java Verified Mode", "D. Just Virtual Memory"}, 
                              {"A. define", "B. struct", "C. class", "D. object"}};

        int size = 0;
        int score = 0;
        

        System.out.println("****************************");
        System.out.println(" Welcome to the Squiz Game!");
        System.out.println("****************************");

            
        for(int i = 0; i < questions.length; i++){
                System.out.println(questions[i]); 
                for(int j = 0; j < options[i].length; j++){
                    System.out.println(options[i][j]);
                }
                System.out.println();
                System.out.print("Answer: ");
                int answer = sc.nextInt();
                
        }
        sc.close();
    }   
}
