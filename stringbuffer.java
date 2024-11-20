public class stringbuffer {
    public static void main(String[] args) {

        // Example 1: Java program to clear using StringBuffer using delete()
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(" Java");
        stringBuffer.append(" is");
        stringBuffer.append(" popular.");
        System.out.println("String Buffer: " + stringBuffer);

        stringBuffer.delete(0, stringBuffer.length());
        System.out.println("Updated StringBuffer: " + stringBuffer);
    }
}

// Example 2: Clear the StringBuffer using setLength()

class clearsetLength {
    public static void main(String[] args) {
  
  
      StringBuffer str = new StringBuffer();
  
     
      str.append("Java");
      str.append(" is");
      str.append(" awesome.");
      System.out.println("StringBuffer: " + str);
  
      
      str.setLength(0);
      System.out.println("Updated StringBuffer: " + str);
    }
  }

//   Example 3: Clear the StringBuffer by creating a new object



class createnewString {
    public static void main(String[] args) {
  
     
      StringBuffer str = new StringBuffer();
  
    
      str.append("Java");
      str.append(" is");
      str.append(" Woww.");
      System.out.println("StringBuffer: " + str);
  
      // clear the string
      // using new
      // here new object is created and assigned to str
      str = new StringBuffer();
      System.out.println("Updated StringBuffer: " + str);
    }
  }