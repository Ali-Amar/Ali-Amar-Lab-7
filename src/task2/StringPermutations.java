package task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringPermutations {
    private boolean excludeDuplicates;
    
    public StringPermutations(boolean excludeDuplicates) {
        this.excludeDuplicates = excludeDuplicates;
    }
    
    public List<String> generatePermutations(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        
        if (excludeDuplicates) {
            Set<String> permSet = new HashSet<>();
            generatePermutationsHelper("", input, permSet);
            return new ArrayList<>(permSet);
        } else {
            List<String> permList = new ArrayList<>();
            generatePermutationsHelper("", input, permList);
            return permList;
        }
    }
    
    private void generatePermutationsHelper(String prefix, String remaining, Set<String> result) {
        int n = remaining.length();
        if (n == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutationsHelper(
                    prefix + remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i + 1, n),
                    result
                );
            }
        }
    }
    
    private void generatePermutationsHelper(String prefix, String remaining, List<String> result) {
        int n = remaining.length();
        if (n == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutationsHelper(
                    prefix + remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i + 1, n),
                    result
                );
            }
        }
    }
}