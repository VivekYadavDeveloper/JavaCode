import java.util.Scanner;

class Factorial {
    static int factorial(int n) {
        if (n != 0)
            return n * factorial(n-1);
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner rScanner = new Scanner(System.in);

        System.out.println("Enter the number for factorial:");

        int number = rScanner.nextInt();
        int result;
        result = factorial(number);
        
        System.out.println(number + " Factorial Is :" + result);
        rScanner.close();
    }
}