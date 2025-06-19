import java.util.Scanner;
import java.util.Stack;
public class NotePadUndo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> notepad = new Stack<>();
        String currentText = "";
        int choice;

        do {
            System.out.println("\nCurrent Text: " + currentText);
            System.out.println("Choose an option: ");
            System.out.println("1. Add text");
            System.out.println("2. Undo Last ");
            System.out.println("3. Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("📝 Enter text to add: ");
                    String newText = sc.nextLine();
                    notepad.push(currentText);
                    currentText += newText;
                    break;
                case 2:
                    if (!notepad.isEmpty()) {
                        currentText = notepad.pop();
                        System.out.println("↩\uFE0F Undo Successful!");
                    } else {
                        System.out.println("⚠️ Nothing to undo!");
                    } break;
                case 3:
                    System.out.println("\uD83D\uDC4B Exiting Notepad. Bye!");
                    break;
                default:
                    System.out.println("Invalid choice . Try again !!");
            }

        } while (choice != 3);
    }
}
