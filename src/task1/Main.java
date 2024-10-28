package task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileSearcher searcher = new FileSearcher(true);
        try {
            List<String> results = searcher.searchFile("C:\\Users\\aamar.bese22seecs\\Documents\\Recursion\\src\\task1", "file.txt");
            if (results.isEmpty()) {
                System.out.println("File not found");
            } else {
                System.out.println("File found in the following locations:");
                results.forEach(System.out::println);
                System.out.println("Total occurrences: " + searcher.getOccurrenceCount());
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}