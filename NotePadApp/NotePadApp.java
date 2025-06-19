

import java.io.*;
import java.util.Scanner;

public class NotePadApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the folder path to save (e.g., src/Java.Basics/IO/notes): ");
        String folderPath = sc.nextLine();

        System.out.print("Enter  the filename (without extension): ");
        String fileName = sc.nextLine();

        System.out.println("Start typing your content (type 'exit' to save & quit): ");

        //Ensure directory exists
        File folder = new File(folderPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        String filePath = folderPath + "/" + fileName + ".txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))){
            while (true) {
                String input = sc.nextLine();
                if (input.equalsIgnoreCase("exit")) break;
                bw.write(input);
                bw.newLine();
            }
            System.out.println("📝 File saved successfully at: " + filePath);
        } catch (IOException e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
    }
}
