package collections;

import java.util.*;

public class CharacterConcordance {

    public static void main(final String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string:");
        String input = scanner.nextLine();
        System.out.println(CharacterConcordance.characterConcordance(input));

    }

    static Map<Character, Set<Integer>> characterConcordance(String input) {

        if (input == null || input.isEmpty() || input.isBlank()) {
            throw new RuntimeException("Empty input!");
        }
        Map<Character, Set<Integer>> concordance = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (character == ' ') {
                continue; // ignore spaces
            }
            Set<Integer> setOccurrence = concordance.get(character);
            if (setOccurrence == null) {
                setOccurrence = new HashSet<>();
            }
            setOccurrence.add(i);
            concordance.put(character, setOccurrence);
        }

        return concordance;
    }


}
