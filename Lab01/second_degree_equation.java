import java.util.Scanner;

public class second_degree_equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("a must be different from 0");
            return;
        }
        
        double delta = b*b - 4*a*c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("Solution:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2*a);
            System.out.println("Solution");
            System.out.println("x1 = x2 = " + x);
        } else {
            System.out.println("No solution");
        }
    }
}