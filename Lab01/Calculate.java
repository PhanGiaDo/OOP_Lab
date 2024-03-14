public class Calculate {
    public static void main(String[] args) {
        String strNum1 = args[0];
        String strNum2 = args[1];

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);

        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Quotient = " + quotient);
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }
}
