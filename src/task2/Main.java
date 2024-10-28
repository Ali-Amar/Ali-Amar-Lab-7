package task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringPermutations permGenerator = new StringPermutations(false);
        String input = null;
        List<String> permutations = permGenerator.generatePermutations(input);
        System.out.println("Permutations of " + input + ":");
        permutations.forEach(System.out::println);
    }
}