import java.util.Scanner;

public class removespace {
    public static void main(String[] args) {
        String sentence = "V   i   v   e  k";
        System.out.println("Original Sentence: " + sentence);


        sentence = sentence.replaceAll("\\s", "");

System.out.println("After Replacement: " + sentence);
    }
}


/*Take string from users and remove the white space*/ 

class Main {
    public static void main(String[] args) {
  
      // create an object of Scanner
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the string");
  
      // take the input
      String input = sc.nextLine();
      System.out.println("Original String: " + input);
  
      // remove white spaces
      input = input.replaceAll("\\s", "");
      System.out.println("Final String: " + input);
      sc.close();
    }
  }