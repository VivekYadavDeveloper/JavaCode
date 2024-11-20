//*Print the following Pattern For The Given N numbers of Row.*/
/* 
Patter For N = 4
 * 4444
 * 4444
 * 4444
 * 4444
 * 
*/


public class pattern1 {
    
    public static void main(String[] args) {
        printPattern(4);
        printPattern2(5);
    }

    private static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                System.out.print(n);
            }
            System.out.println();

        }
    }

    private static void printPattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                System.out.print("*");
            }
            System.out.println( );

         }
    }
}
