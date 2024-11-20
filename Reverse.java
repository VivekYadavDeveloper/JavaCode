public class Reverse {
    public static void main(String[] args) {
        String sentence = "Tiger";
        String reversed = reverse(sentence);
        System.out.println("The reversed sentence is: " + reversed);
    }
    
    public static String reverse(String text) {
        
        if (text.isEmpty()) 
            return text;
    

        return reverse(text.substring(1)) + text.charAt(0);
        } 
}
