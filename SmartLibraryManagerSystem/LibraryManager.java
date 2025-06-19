import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class LibraryManager {
    private TreeMap<Integer, Book> library = new TreeMap<>();
    private Scanner sc = new Scanner(System.in);

    public void startLibrary() {
        while (true) {
            System.out.println("\nSmart Library Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Return Book");
            System.out.println("4. Show Available Books");
            System.out.println("5. Exit");
            System.out.print("\uD83D\uDC49 Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: addBook(); break;
                case 2: borrowBook(); break;
                case 3: returnBook(); break;
                case 4: showAvailableBooks(); break;
                case 5:
                    System.out.println("\uD83D\uDC4B Exiting..."); return;
                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
    }

    private void addBook() {
        System.out.print("\uD83D\uDCD6  Enter Book ID: ");
        int id = sc.nextInt();sc.nextLine();
        System.out.print("📝 Title: ");
        String title = sc.nextLine();
        System.out.print("👤 Author: ");
        String author = sc.nextLine();
        System.out.print("🏷️ Genre: ");
        String genre = sc.nextLine();

        Book book = new Book(id, title, author, genre);
        library.put(id, book);
        System.out.println("✅ Book added successfully!");
    }

    private void borrowBook() {
        System.out.print("🔎 Enter Book ID to borrow: ");
        int id = sc.nextInt();sc.nextLine();
        Book book = library.get(id);

        if ( book != null && book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("✅ You've borrowed: " + book.getTitle());
        } else {
            System.out.println("❌ Book unavailable or doesn't exist.");
        }
    }

    private void returnBook() {
        System.out.print("🔁 Enter Book ID to return: ");
        int id = sc.nextInt();sc.nextLine();
        Book book = library.get(id);

        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("✅ Book returned: " + book.getTitle());
        } else {
            System.out.println("❌ Invalid return operation.");
        }
    }

    private void showAvailableBooks() {
        System.out.println("\n📚 Available Books:");
        for (Map.Entry<Integer, Book> entry : library.entrySet()) {
            Book book = entry.getValue();
            if (book.isAvailable()) {
                System.out.println("🔹 ID: " + book.getId() +
                        ", Title: " + book.getTitle() +
                        ", Author: " + book.getAuthor() +
                        ", Genre: " + book.getGenre());
            }
        }
    }
}
