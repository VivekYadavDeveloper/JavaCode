
/*
printPattern
* 1234
* 1234
* 1234
* 1234
 * 
 */


 

public class pattern2 {
    public static void main(String[] args) {
        printPattern(4);
    }
    
    private static void printPattern(int n){

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                System.out.print(j);
            }
            System.out.println();
        }

    }
}
