import java.util.Scanner;

public class oddeven {

    public static void main(String[] args) {
        try (Scanner rScanner = new Scanner(System.in)) {
            System.out.println("Enter the Number:");

            int number = rScanner.nextInt();
            // int number = 0;
            
            if (number % 2 == 0 ) {
                System.out.println(number + " Is Even.");
            } else {
                System.out.println(number + " Is Odd.");
            }
        }
    }
    
}
