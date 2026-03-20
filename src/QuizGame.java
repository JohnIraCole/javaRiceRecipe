import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] questions = {"What is Java mainly used for?",  //Answer: 2
                              "Which of these is a primitive data type?", //Answer: 3
                              "What does JVM stand for?", //Answer: 2
                              "Which keyword is used to create a class?", //Answer: 3
                              "What is the default value of an int (instance variable)?"}; //Answer: 1
                              

        String[][] options = {{"1. Styling webpages", "2. Building application", "3. Managing databases only", "4. Designing hardware"},
                              {"1. String", "2. Array", "3. int", "4. Class"},
                              {"1. Java Variable Method", "2. Java Virtual Machine", "3. Java Verified Mode", "4. Just Virtual Memory"}, 
                              {"1. define", "2. struct", "3. class", "4. object"},
                              {"1. 0","2. null","3. undefined","4. 1"}};

        int score = 0;
        int[] answers  = {2,3,2,3,1};
        int ans;
        int k = 0;

        System.out.println("****************************");
        System.out.println(" Welcome to the Squiz Game!");
        System.out.println("****************************");

            
        for(int i = 0; i < questions.length; i++){       
            // DISPLAYS QUESTION AND OPTIONS
                System.out.println(questions[i]+ " \n"); 
                for(int j = 0; j < options[i].length; j++){
                    System.out.println(options[i][j]);
                }
                System.out.println();
                System.out.print("Answer: ");
                ans = sc.nextInt();

                if(ans == answers[k]){
                    score++;
                    System.out.println("\n**********");
                    System.out.println(" CORRECT! ");
                    System.out.println("**********\n");

                }
                else{
                    score++;
                    System.out.println("\n**********");
                    System.out.println("  WRONG! ");
                    System.out.println("**********\n");
                }

                k++;
        }

        if(score > 0){
            System.out.println("**********************************");
            System.out.println(" Your final score is: " + score + " out of " + questions.length);
            System.out.println("**********************************");
        }
        else{
            System.out.println("**********************************");
            System.out.println(" Your final score is: 0 out of " + questions.length);
            System.out.println("**********************************");
        }
        sc.close();
    }   
}
