import java.util.Scanner;

public class compoundinterest {
    
    /* Calculate Compound Interest in Java */

    public static void main(String[] args) {
        Scanner rScanner = new Scanner(System.in);


        System.out.print("Enter the principal: ");
        double principal = rScanner.nextDouble();


        System.out.print("Enter the rate: ");
        double rate = rScanner.nextDouble();

        System.out.print("Enter the time: ");
        double time = rScanner.nextDouble();

        System.out.print("Enter number of times interest is compounded: ");

        int number = rScanner.nextInt();

        double interest = principal * (Math.pow((1 + rate / 100), (time * number))) - principal;

        System.out.println("Principal: " + principal);
    System.out.println("Interest Rate: " + rate);
    System.out.println("Time Duration: " + time);
    System.out.println("Number of Time interest Compounded: " + number);
    System.out.println("Compound Interest: " + interest);

    rScanner.close();
    }
}
