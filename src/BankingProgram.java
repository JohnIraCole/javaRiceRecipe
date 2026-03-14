import java.util.Scanner;
public class BankingProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double balance = 0;
        boolean isTrue = true;
        
        do{
            System.out.println("\n*****************");
            System.out.println(" BANKING PROGRAM");
            System.out.println("*****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit ");
            System.out.println("3. Withdraw ");
            System.out.println("4. Exit");            

            System.out.print("Enter your choice (1-4): ");
            int op = sc.nextInt();
            System.out.println();

            switch(op){
                case 1 -> System.out.printf("Balance: %.2f\n",balance);
                case 2 -> {
                    System.out.print("Enter amount to Deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                }
                case 3 -> {
                    System.out.print("How much to Withdraw? ");
                    double withdraw = sc.nextInt();
                    if(balance <= 0)
                        System.out.println("You have nothing to withdraw");
                    else
                        balance = balance - withdraw;
                }
                case 4 -> isTrue = false;
                default -> System.out.println("Enter valid option");
            }           
        }while(isTrue);
       
        sc.close();
        
    }
}
