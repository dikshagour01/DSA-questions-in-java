import java.util.*;

public class itinerary_for_tickets {
    
    // Method to find the starting point of the itinerary
    public static String starting_point(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();
        
        // Create a reverse map to map destination to source
        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        // Find the starting point which is not a destination in the reverse map
        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }
        return null; // In case no starting point is found
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        
        // Adding ticket entries to the HashMap
        tickets.put("chennai", "Bengaluru");
        tickets.put("mumbai", "Delhi");
        tickets.put("Goa", "chennai");
        tickets.put("Delhi", "Goa");

        // Find the starting point of the itinerary
        String start = starting_point(tickets);
        System.out.print(start); // Print the starting point

        // Print the entire itinerary from the starting point
        while (tickets.containsKey(start)) {
            System.out.print("->" + tickets.get(start));
            start = tickets.get(start); // Move to the next point in the itinerary
        }
    }
}
