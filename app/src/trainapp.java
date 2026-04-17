import java.util.*;

public class trainapp {

    // Binary Search Method
    static boolean binarySearch(String[] bogies, String key) {

        int low = 0;
        int high = bogies.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = bogies[mid].compareTo(key);

            if (result == 0) {
                System.out.println("Bogie found at position: " + mid);
                return true;
            }
            else if (result < 0) {
                low = mid + 1; // search right
            }
            else {
                high = mid - 1; // search left
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Unsorted bogie IDs
        String[] bogies = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Sort before binary search
        Arrays.sort(bogies);

        System.out.println("Sorted Bogies: " + Arrays.toString(bogies));

        // Search key
        String searchKey = "BG309";

        System.out.println("Searching for: " + searchKey);

        boolean found = binarySearch(bogies, searchKey);

        if (found) {
            System.out.println("Bogie exists in the train.");
        } else {
            System.out.println("Bogie NOT found.");
        }

        System.out.println("Binary Search completed.");
    }
}