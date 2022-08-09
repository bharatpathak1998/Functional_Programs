package FP3;

import java.util.Scanner;

public class Distance {
    static void euclideanDistance(int x, int y) {
        double result = Math.sqrt((x*x)+(y*y));
        System.out.println("Euclidean Distance : "+result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y : ");
        int y = sc.nextInt();
        euclideanDistance(x, y);
    }
}
