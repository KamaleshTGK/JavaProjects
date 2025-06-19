

import java.util.ArrayList;
import java.util.Scanner;
public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Management Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. View All Students");
            System.out.println("0. Exit");
            System.out.println("----------");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name to add: ");
                    String nameToAdd = sc.nextLine();
                    students.add(nameToAdd);
                    System.out.println("✅ Student added!");
                    break;

                case 2:
                    System.out.print("Enter student name to remove: ");
                    String nameToRemove = sc.nextLine();
                    if (students.remove(nameToRemove)) {
                        System.out.println("✅ Student removed!");
                    } else {
                        System.out.println(" Student not found!!");
                    }
                    break;

                case 3:
                    System.out.println("📋 List of Students:");
                    if (students.isEmpty()) {
                        System.out.println("⚠️ No students in the list.");
                    } else {
                        for (String student : students) {
                            System.out.println("-  " + student);
                        }
                    }
                    break;

                case 0 :
                    System.out.println("👋 Exiting...");
                    break;

                    default:
                    System.out.println("Enter valid choice....");}
        } while (choice != 0);

        sc.close();
    }
}
