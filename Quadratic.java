package FP4;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        double firstRoot, secondRoot;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b : ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c : ");
        double c = sc.nextDouble();

        double delta = (b*b)-(4*a*c);
        double sqrt = Math.sqrt(delta);

        if(delta>=0) {
            firstRoot = (-b + sqrt)/(2*a);
            secondRoot = (-b - sqrt)/(2*a);
            System.out.println("Roots are : "+firstRoot+" and "+secondRoot);
        } else {
            System.out.println("Invalid");
        }
    }
}
