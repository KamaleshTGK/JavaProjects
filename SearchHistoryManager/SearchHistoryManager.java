import java.util.Scanner;
import java.util.LinkedHashSet;
public class SearchHistoryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> history = new LinkedHashSet<>();

        System.out.println("\uD83D\uDD0E Start typing your searches (type 'exit' to stop):");

        while (true) {
            System.out.print("\uD83D\uDD0D Search: ");
            String search = sc.nextLine();

            if (search.equalsIgnoreCase("exit")) {
                break;
            }
            history.add(search);
        }

        sc.close();

        System.out.println("\n🗂️ Your Search History:");
        for (String input : history) {
            System.out.println("-  " + input);
        }
    }
}
