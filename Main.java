import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Step 3: Create a map called creditHours
        Map<String, Integer> creditHours = new HashMap<>();

        // Step 4: Put the given values into the map
        creditHours.put("IT-1025", 3);
        creditHours.put("IT-1050", 3);
        creditHours.put("IT-1150", 3);
        creditHours.put("IT-2310", 3);
        creditHours.put("IT-2320", 4);
        creditHours.put("IT-2351", 4);
        creditHours.put("IT-2650", 4);
        creditHours.put("IT-2660", 4);
        creditHours.put("IT-2030", 4);

        // Step 5: Check for specific keys and display true or false
        System.out.println("Does the map contain IT-1025? " + creditHours.containsKey("IT-1025"));
        System.out.println("Does the map contain IT-2110? " + creditHours.containsKey("IT-2110"));

        // Step 6: Print all the values in the map
        System.out.println("All credit hours:");
        for (Map.Entry<String, Integer> entry : creditHours.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Step 7: Remove IT-2030 and IT-1150 from the map
        creditHours.remove("IT-2030");
        creditHours.remove("IT-1150");

        // Step 8: Print all the remaining values in the map
        System.out.println("Credit hours after removal:");
        for (Map.Entry<String, Integer> entry : creditHours.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
