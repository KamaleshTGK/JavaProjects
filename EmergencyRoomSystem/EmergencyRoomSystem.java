import java.util.PriorityQueue;
import java.util.Scanner;

class Patient implements Comparable<Patient> {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name= name;
        this.severity = severity;
    }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(this.severity, other.severity);
    }
}
public class EmergencyRoomSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Patient> queue = new PriorityQueue<>();

        System.out.print("How many patients to register? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n ; i++) {
            System.out.print("\nEnter patient " + i + " name: ");
            String name = sc.nextLine();
            System.out.print("Enter severity level (1=serious, higher=less serious)");
            int severity = sc.nextInt();
            sc.nextLine();
            queue.add(new Patient(name, severity));
        }

        System.out.println("\n🚑 Treating patients based on severity:");

        while(!queue.isEmpty()) {
            Patient p = queue.poll();
            System.out.println("Treating patient: " + p.name + " (Severity: " + p.severity + ")");
        }
    }
}
