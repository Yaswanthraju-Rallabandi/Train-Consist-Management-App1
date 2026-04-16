import java.util.HashSet;
import java.util.Set;

public class train_app {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs: " + bogieIDs);

        // Program continues
        System.out.println("Duplicate IDs are automatically ignored.");
    }
}