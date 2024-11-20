import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        // If We Use HashMap For Maping in Show The Result In Un Order Pattern.
        
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Ram", 52);
        map1.put("Vivek", 25);
        map1.put("Lalti Yadav", 53);
        map1.put("Vishal", 27);


        System.out.println(map1);
        
        Map<String, Integer> map2 = new LinkedHashMap<>();

        // If We Use Linked HashMap It Show The Data in Ordered Form.
        // In Other Word if You Want To Maintain The Order Then Use This.

        map2.put("Ram", 52);
        map2.put("Vivek", 25);
        map2.put("Lalti Yadav", 53);
        map2.put("Vishal", 27);

System.out.println(map2);
        


    }
}
