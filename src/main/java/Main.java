import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("This is simple Calculator program.");
        while (true) {
            System.out.println("Write the first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("연산자(+ - * /): " );
            char operator = scanner.next().charAt(0);

            System.out.println("Write the second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean validOperation = true;

            //implement calculating by 연산자
            switch (operator) {
                case '+':
                    result = calculator.add(num1,num2);
                    break;
                case '-':
                    result = calculator.subtract(num1, num2);
                    break;
                case '*':
                    result =  calculator.multiply(num1, num2);
                    break;
                case '/':
                    try {
                        result = calculator.divide(num1, num2);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("It's a wrong 연산자.");
                    validOperation = false;
            }

            //결과 출력
            if (validOperation) {
                System.out.println("결과: " + result);
            }

            //Check if you keep going or not
            System.out.println("Do you want to keep going? (y/n): ");
            char continueChoice = scanner.next().charAt(0);
            if (continueChoice == 'n' || continueChoice == 'N') {
                break;
            }

        }

        System.out.println("close the calculator.");
        scanner.close();


    }

}
