package array;

import java.util.Arrays;
import java.util.regex.Pattern;

public class AnagramString {
    public static void main(String[] args) {
        String firstString = "Desperation";
        String secondString = "A Ropes End It";
        if (isAnagram(firstString, secondString)) {
            System.out.println('"' + firstString + '"' + " and " + '"' + secondString + '"' + " are anagrams");
        } else {
            System.out.println('"' + firstString + '"' + " and " + '"' + secondString + '"' + " are not anagrams");
        }
    }

    static boolean isAnagram(String firstString, String secondString) {
        Pattern pattern = Pattern.compile("^[A-Za-z ]++$");
        if (!pattern.matcher(firstString).matches() || !pattern.matcher(secondString).matches()) {
            throw new IllegalArgumentException();
        }
        String s1 = firstString.replaceAll("\\s", "");
        String s2 = secondString.replaceAll("\\s", "");
        if (s1.length() == s2.length()) {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            if (Arrays.equals(ArrayS1, ArrayS2)) return true;
        }
        return false;

    }
}
