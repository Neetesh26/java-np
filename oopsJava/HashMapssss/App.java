
    import java.util.*;

    public class App {
        public static void main(String[] args) {

            HashMap<String, String> hashMap = new HashMap<>();

            hashMap.put("01", "Neetesh");
            hashMap.put("02", "rasoma");
            hashMap.put("03", "radison");

            System.out.println(hashMap.get("01")); // Output: Neetesh
            System.out.println(hashMap.get("02")); // Output: rasoma
            System.out.println(hashMap.get("03")); // Output: radison

            for(Map.Entry<String,String> entry : hashMap.entrySet()){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }