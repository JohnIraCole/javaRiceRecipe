import java.util.Scanner;

public class MathClasses {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /* System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double d = Math.sqrt(Math.pow((x1 - x2) , 2) + Math.pow((y1 - y2), 2)); // Distance between two points formula

        System.out.printf("Distance between 2 points: %.2f",d);
        */

        /* 
        System.out.print("Radius: ");
        double r = sc.nextDouble();

        double area = Math.PI * Math.pow(r,2); // Formula for calculating area of a circle

        System.out.printf("Area of the circle: %.2f",area);
        */

        /* 
        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.printf("Hypotenose of a right triangle: %.2f",c);
        */
        
        /* 
        System.out.print("Amount: ");
        int p = sc.nextInt();

        System.out.print("Annual interest: ");
        double r = sc.nextDouble();

        System.out.print("Compound for annual interest: ");
        int n = sc.nextInt();

        System.out.print("Number of years: ");
        int t = sc.nextInt();

        double A = p * (Math.pow((1 + r / n), n * t)); // Formula for compound interest
        
        System.out.printf("Compound Interest: %.2f", A );
        */
        
        /* 
        System.out.print("Coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Coefficient c: ");
        double c = sc.nextDouble();

        double x1 = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / 2 * a; // Quadratic Formula
        double x2 = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / 2 * a;

        System.out.printf("Quadratic x1: %.2f\n",x1);
        System.out.printf("Quadratic x1: %.2f",x2);
        */

        sc.close();
    }
}

