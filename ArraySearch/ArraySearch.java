import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {5, 9, 2, 3, 6, 5, 7, 2};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        int count = 0;

        for (int num : arr) {
            if (num == key) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Found! Appears " + count + " time(s).");
        } else {
            System.out.println("Not found.");
        }
        sc.close();
    }
}
