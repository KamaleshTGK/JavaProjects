//Register new voters (using their Voter ID).
//
//Prevent duplicate Voter IDs (because a person should register only once).
//
//Allow checking if a Voter ID is already registered.
//
//Allow displaying all registered voters.
//
//Exit system.

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
public class VoterRegistrationSystem {
    public static void main(String[] args) {
        Set<String> voterIDs = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Register new Voter ID");
            System.out.println("2. Check if Voter ID is registered");
            System.out.println("3. View all registered Voter IDs");
            System.out.println("4. Exit");
            System.out.print("➡️ Your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    System.out.print("🆔 Enter Voter ID to register: ");
                    String voterId = sc.nextLine();
                    if (voterIDs.add(voterId)) {
                        System.out.println("✅ Voter ID registered successfully!");
                    } else {
                        System.out.println("⚠\uFE0F Voter ID already exists! Registration unsuccessful");
                    }
                    break;

                case 2:
                    System.out.print("\uD83D\uDD0D Enter Voter ID to check: ");
                    String checkID = sc.nextLine();
                    if (voterIDs.contains(checkID)) {
                        System.out.println("✅ Voter ID is already registered.");
                    } else {
                        System.out.println("❌ Voter ID not found. Please register");
                    }
                    break;

                case 3:
                    System.out.print("\uD83D\uDCCB All Registered Voter IDs:");
                    for (String id : voterIDs) {
                        System.out.println("-  " + id);
                    }
                    break;

                case 4:
                    System.out.println("👋 Thank you for using the Voter Registration System!");
                    System.exit(0);

                default:
                    System.out.println("⚠\uFE0F Invalid choice. Please try again.");


            }
        }
    }
}
