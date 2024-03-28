import java.util.Scanner;
import java.util.Arrays;

public class sort_sum_average_array {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("n = ");
        int n = keyboard.nextInt();

        double[] a = new double[n];
        System.out.print("Array: ");
        for (int i = 0; i < n; i++) {
            a[i] = keyboard.nextDouble();
        }

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (a[i] > a[j]){
                    double temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        double sum = 0;
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
            sum += a[i];
        }
        double average = sum / n;
        System.out.println();
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
