import java.util.*;

public class trainapp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie names (unsorted)
        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Before Sorting: " + Arrays.toString(bogies));

        // Built-in sorting
        Arrays.sort(bogies);

        System.out.println("After Sorting (Alphabetical): " + Arrays.toString(bogies));

        System.out.println("Sorting completed using Arrays.sort().");
    }
}
