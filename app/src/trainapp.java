import java.util.*;

// Passenger Bogie class
class PassengerBogie {
    String name;
    int capacity;

    PassengerBogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class trainapp {

    // Bubble Sort (Manual)
    static void bubbleSort(List<PassengerBogie> list) {

        int n = list.size();
        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (list.get(j).capacity > list.get(j + 1).capacity) {

                    // Swap manually
                    PassengerBogie temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);

                    swaps++;
                    swapped = true;
                }
            }

            // Optimization (early stop)
            if (!swapped) break;
        }

        System.out.println("Sorted Bogies (ASC): " + list);
        System.out.println("Total Swaps: " + swaps);
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create passenger bogies
        List<PassengerBogie> list = new ArrayList<>();
        list.add(new PassengerBogie("Sleeper", 72));
        list.add(new PassengerBogie("AC Chair", 56));
        list.add(new PassengerBogie("First Class", 24));

        System.out.println("Before Sorting: " + list);

        // Apply Bubble Sort
        bubbleSort(list);

        System.out.println("Sorting completed.");
    }
}