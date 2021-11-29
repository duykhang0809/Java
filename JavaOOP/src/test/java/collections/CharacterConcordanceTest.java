package collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class CharacterConcordanceTest {

    //Positive case
    @Test
    public void given_aString_when_itsValid_then_returnCharacterConcordance() {
        Map<Character, Set<Integer>> expected = new HashMap<>();
        expected.put('e', new HashSet<>(Arrays.asList(1)));
        expected.put('H', new HashSet<>(Arrays.asList(0)));
        expected.put('l', new HashSet<>(Arrays.asList(2, 3)));
        expected.put('o', new HashSet<>(Arrays.asList(4)));
        Map<Character, Set<Integer>> actual = CharacterConcordance.characterConcordance("Hello");
        Assert.assertEquals(expected, actual);
    }

    //Negative case
    @Test(expected = RuntimeException.class)
    public void given_aString_when_itsBlankOrEmpty_then_returnThrowException() {
       CharacterConcordance.characterConcordance(" ");
    }
}