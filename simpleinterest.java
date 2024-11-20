import java.util.Scanner;
/* Calculate Simple Interest in Java */ 
public class simpleinterest {
    
    public static void main(String[] args) {
        try (Scanner rScanner = new Scanner(System.in)) {


            System.out.println("Enter the principal: ");
            double principal = rScanner.nextDouble();
            
            System.out.println("Enter the rate: ");
            double rate = rScanner.nextDouble();
            
            System.out.println("Enter the time: ");
            double time = rScanner.nextDouble();
             

            double interest = (principal * time * rate) / 100;
            

            System.out.println("Principal: " + principal);
            System.out.println("Interest Rate: " + rate);
            System.out.println("Time: " + time);
            System.out.println("Simple Interest: " + interest);

            rScanner.close();
        }
        
    }
}





