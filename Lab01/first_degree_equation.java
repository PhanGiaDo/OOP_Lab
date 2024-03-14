import java.util.Scanner;

public class first_degree_equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();

        if (a == 0) {
            System.out.println("a must be different from 0");
            return;
        }

        double x = -b / a;
        System.out.println("x = " + x);

    }
}
