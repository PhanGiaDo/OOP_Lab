import java.util.Scanner;

public class display_days {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("month = ");
        int month = keyboard.nextInt();
        System.out.print("year = ");
        int year = keyboard.nextInt();

        int leap = 0;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) leap = 1;
        System.out.print("Number of days is: ");
        switch (month) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                int temp = 28 + leap;
                System.out.println("" + temp);
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
            default:
                System.out.println("Month must be integers from 1 to 12");
                break;
        }
    }
}
