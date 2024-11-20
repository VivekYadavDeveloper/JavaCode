/*
 * Example 1: Program to print half pyramid using *.
 * Example 2: Program to print half pyramid using number.
 * Example 3: Program to print half pyramid using alphabate.
 */

public class halfpyramidpattern {
    // public static void main(String[] args) {
    //     int n = 5;
    //     for (int i = 1; i <= n; i++) {

    //         for (int j = 1; j <= i; ++j) {
    //             System.err.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }
    
    // public static void usingNumber(String[] args) {
    //     int n = 5;
    //     for (int i = 1; i <= n; i++) {

    //         for (int j = 1; j <= i; ++j) {
    //             System.err.print(j);
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String[] args) {
        char last = 'Z' , alphabate ='A';
        for (int i = 1; i <= (last- 'A' +1); i++) {
            
            for (int j = 1; j <= i; ++j) {
                System.err.print(alphabate);
            }
            alphabate++;
            System.out.println();
        }
    }
    
}
