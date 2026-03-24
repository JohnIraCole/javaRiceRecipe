import java.util.Scanner;
public class Patterns {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter symbol: ");
        String symbol = sc.next();

        System.out.print("Enter # of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter # of columns: ");
        int columns = sc.nextInt();

        pyramid(symbol,rows,columns);
        reversePyramid(symbol,rows,columns);

        sc.close();
    }
    static void pyramid(String symbol, int row, int column){
        System.out.println("\nPYRAMID");   
        for(int i = 0; i < row; i++){
            for(int j = column; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    static void rightTriangle(String symbol,int row){
        for(int i = 0; i < row; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(symbol + "");
            }
            System.out.println();
        }
    }

    static void leftTriangle(String symbol, int row, int column){
        for(int i = 0; i < row;i++){
            for(int j = column; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print(symbol + "");
            }
            System.out.println();
        }
    }

    static void rDownTriangle(String symbol, int row){
        for(int i = 0; i < row; i++){
            for(int j = row; j > i; j--){
                System.out.print(symbol + "");
            }
            System.out.println();
        }
    }

    static void lDowntriangle(String symbol, int row, int column){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < i ; j++){
                System.out.print(" ");
            }
            for(int k = column; k > i; k--){
                System.out.print(symbol + "");
            }
            System.out.println();
        }
    }

    // NEEDS FIXING
    static void doubleHill(String symbol, int row, int column){
        for(int i = 0; i < row; i++){
            for(int j = column; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print(symbol + " ");
            }
            for(int t = column; t > i; t--){
                System.out.print(" ");
            }
            for(int t =  column - 1; t > i; t--){
                System.out.print(" ");
            }
            for(int k = 0 ; k <= i; k++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    static void reversePyramid(String symbol, int row, int column){
        System.out.println("\n   REVERSE");
        System.out.println("   PYRAMID"); 
        for(int i = 0; i < row; i++){
            for(int j = 0; j < i ; j++){
                System.out.print(" ");
            }
            for(int k = column; k > i; k--){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    static void diamond(String symbol, int row, int column){
        for(int i = 0; i < row; i++){
            if(i != 3){
                for(int j = column; j > i; j--){
                    System.out.print(" ");
                }
                for(int k = 0; k <= i; k++){                
                        System.out.print(symbol + " ");  
                }
            }
            else{continue;}
            System.out.println();
        }
        for(int i = 0; i < row;i ++){
            if(i != 0 && i != 1){
                for(int j = 0; j <= i; j++){
                    System.out.print(" ");
                }
                for(int k = column; k > i; k--){
                    System.out.print(symbol + " ");
                }
            }
            else{continue;}
            System.out.println();
        }
    }
}
