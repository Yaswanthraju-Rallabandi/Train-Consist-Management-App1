import java.util.*;

public class trainapp {

    // Search Method with Validation
    static boolean searchBogie(String[] bogies, String key) {

        // Fail-fast validation
        if (bogies.length == 0) {
            throw new IllegalStateException("No bogies available in the train. Cannot perform search.");
        }

        // Linear Search
        for (int i = 0; i < bogies.length; i++) {
            if (bogies[i].equals(key)) {
                System.out.println("Bogie found at position: " + i);
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Example 1: Empty array (to trigger exception)
        String[] bogies = {};

        String searchKey = "BG101";

        try {
            System.out.println("Searching for: " + searchKey);

            boolean found = searchBogie(bogies, searchKey);

            if (found) {
                System.out.println("Bogie exists in the train.");
            } else {
                System.out.println("Bogie NOT found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}