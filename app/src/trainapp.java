import java.util.*;

public class trainapp {

    // Linear Search Method
    static boolean linearSearch(String[] bogies, String key) {

        for (int i = 0; i < bogies.length; i++) {

            // Compare using equals()
            if (bogies[i].equals(key)) {
                System.out.println("Bogie found at position: " + i);
                return true; // early stop
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs (unsorted)
        String[] bogies = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Search key
        String searchKey = "BG309";

        System.out.println("Searching for: " + searchKey);

        boolean found = linearSearch(bogies, searchKey);

        if (found) {
            System.out.println("Bogie exists in the train.");
        } else {
            System.out.println("Bogie NOT found.");
        }

        System.out.println("Search operation completed.");
    }
}