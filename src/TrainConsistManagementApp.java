import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<String> bogies = new ArrayList<>();

        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("Bogies after adding: " + bogies);

        bogies.remove("AC Chair");

        if (bogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        }

        System.out.println("Final Bogie List: " + bogies);
    }
}