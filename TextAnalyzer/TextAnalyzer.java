import java.util.*;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paragraph: ");
        String paragraph = sc.nextLine();

        // Count words
        String[] words = paragraph.split("\\s+");
        System.out.println("Total words: " + words.length);

        // Count vowels and consonants
        int vowels = 0, consonants = 0;
        paragraph = paragraph.toLowerCase();
        for (int i = 0; i < paragraph.length(); i++) {
            char ch = paragraph.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        // Find most frequent word
        Map<String, Integer> wordFreq = new HashMap<>();
        for (String w : words) {
            w = w.toLowerCase();
            wordFreq.put(w, wordFreq.getOrDefault(w, 0) + 1);
        }

        String mostFreqWord = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFreqWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("Most frequent word: " + mostFreqWord + " (" + maxCount + " times)");

        // Replace word
        System.out.print("Enter word to replace: ");
        String oldWord = sc.next();
        System.out.print("Enter new word: ");
        String newWord = sc.next();
        String newParagraph = paragraph.replaceAll("(?i)\\b" + oldWord + "\\b", newWord);
        System.out.println("New paragraph: ");
        System.out.println(newParagraph);
    }
}
