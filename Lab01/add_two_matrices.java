import java.util.Scanner;

public class add_two_matrices {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Number of rows: ");
        int rows = keyboard.nextInt();
        System.out.print("Number of columns: ");
        int columns = keyboard.nextInt();

        System.out.println("Matrix A :");
        int[][] A = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                A[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("Matrix B :");
        int[][] B = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                B[i][j] = keyboard.nextInt();
            }
        }

        int[][] C = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("A + B =");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
