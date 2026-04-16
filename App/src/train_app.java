import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class train_app {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies (same as UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Second Sitting", 80));

        // Display original list
        System.out.println("All Bogies: " + bogies);

        // Filter bogies with capacity > 60 using Stream
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered list
        System.out.println("Filtered Bogies (Capacity > 60): " + filteredBogies);

        // Program continues
        System.out.println("Filtering completed using Stream API.");
    }
}