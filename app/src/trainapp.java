import java.util.ArrayList;
import java.util.List;

// Goods Bogie class
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String toString() {
        return type + " (" + cargo + ")";
    }
}

public class trainapp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid

        // Display bogies
        System.out.println("Goods Bogies: " + goodsBogies);

        // Safety validation using Stream
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );

        // Display result
        if (isSafe) {
            System.out.println("Train is SAFE for operation.");
        } else {
            System.out.println("Train is NOT SAFE! Invalid cargo detected.");
        }

        // Program continues
        System.out.println("Safety compliance check completed.");
    }
}