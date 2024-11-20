import java.util.Scanner;


/* Make a Simple Calculator Using switch...Case */ 
public class calculator {
    public static void main(String[] args) {
        double number1, number2, number3;
        char operator;

        double result;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Choose an operator: +, -, *, or /");

        operator = scanner.next().charAt(0);

        System.out.println("Enter first number: ");

        number1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        number2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
        scanner.close();
    }
}
