import java.util.ArrayList;
import java.util.List;

// Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class trainapp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Second Sitting", 80));

        // Display bogies
        System.out.println("All Bogies: " + bogies);

        // Calculate total capacity using Stream
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)      // extract capacity
                .reduce(0, Integer::sum);  // sum all values

        // Display total
        System.out.println("Total Seating Capacity: " + totalCapacity);

        // Program continues
        System.out.println("Aggregation completed successfully.");
    }
}