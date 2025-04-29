import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("************************************************");
        System.out.println("**                                            **");
        System.out.println("**        WELCOME TO MY SIMPLE CALCULATOR     **");
        System.out.println("**                                            **");
        System.out.println("************************************************\n");

        System.out.println("Enter the first number: \n");
        double n1 = reading.nextDouble();

        System.out.println("Enter the second number:\n ");
        double n2 = reading.nextDouble();

        System.out.println("Enter the operator (+, -, *, /):\n ");
        char operator = reading.next().charAt(0);

        double result;

        if (operator == '+'){
            result = sum(n1, n2);
        } else if (operator == '-') {
            result = subtraction(n1, n2);
        } else if (operator == '*') {
            result = multiple(n1, n2);
        } else if (operator == '/') {
            result = division(n1, n2);
        } else {

            System.out.println("Invalid operation!");
            result = 0;
        }
        System.out.println("Result: " + result);
        }
        public static double sum ( double a, double b){
            return a + b;
        }

        public static double subtraction ( double a, double b){
            return a - b;
        }

        public static double multiple ( double a, double b){
            return a * b;
        }

        public static double division ( double a, double b) {
            if (a == 0) {
                return 0;
            }
            return a / b;
        }
}
