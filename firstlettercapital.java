public class firstlettercapital {
    
    public static void main(String[] args) {
        String name = "vivek";
        
        String firstLetter = name.substring(0, 1);
        String remainingLetter = name.substring(1, name.length());

        firstLetter = firstLetter.toUpperCase();

        name = firstLetter + remainingLetter;
        System.out.println("Name: "+ name);
    }
}
