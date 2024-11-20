/*
printPattern
* 1111
* 2222
* 3333
* 4444
 * 
 */

public class pattern3 {
    public static void main(String[] args) {
patterPrint(4);
    }
    


    private static void patterPrint(int n) {
        for (int i = 1; i <= n; i++) {
        
            for (int j = 1; j <= n; j++) {

                System.out.print(i);
            }
        System.out.println();
        }
    
    }
}
