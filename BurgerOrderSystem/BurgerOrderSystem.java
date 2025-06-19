import java.util.PriorityQueue;
import java.util.Scanner;

class BurgerOrder implements Comparable<BurgerOrder> {
    String customerName;
    int priority;

    public BurgerOrder(String customerName, int priority) {
        this.customerName = customerName;
        this.priority = priority;
    }

    @Override
    public int compareTo(BurgerOrder other) {
        return this.priority - other.priority;
    }
}

public class BurgerOrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<BurgerOrder> orderQueue = new PriorityQueue<>();

        System.out.print("\uD83C\uDF54 How many customers are ordering today? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n ; i++) {
            System.out.print("\n\uD83D\uDC64 Customer " + i);
            System.out.print("\nEnter customer name: ");
            String name = sc.nextLine();
            System.out.print("Enter priority (1 = VIP, 2 = Normal, 3 = Bulk Order): ");
            int priority = sc.nextInt();
            sc.nextLine();
            orderQueue.offer(new BurgerOrder(name, priority));
        }
        System.out.println("\n🍔 Serving Orders based on Priority:\n");

        while (!orderQueue.isEmpty()) {
            BurgerOrder order = orderQueue.poll();
            System.out.println("➡️ Serving: " + order.customerName + " (Priority " + order.priority + ")");
        }
    }
}
