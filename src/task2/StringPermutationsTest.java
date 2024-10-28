package task2;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class StringPermutationsTest {
    
    @Test
    public void testBasicPermutation() {
        StringPermutations permGenerator = new StringPermutations(false);
        List<String> results = permGenerator.generatePermutations("ABC");
        assertEquals(6, results.size());
        assertTrue(results.contains("ABC"));
        assertTrue(results.contains("ACB"));
        assertTrue(results.contains("BAC"));
        assertTrue(results.contains("BCA"));
        assertTrue(results.contains("CAB"));
        assertTrue(results.contains("CBA"));
    }
    
    @Test
    public void testDuplicateHandling() {
        StringPermutations permGenerator = new StringPermutations(true);
        List<String> results = permGenerator.generatePermutations("AAB");
        assertEquals(3, results.size());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNullInput() {
        StringPermutations permGenerator = new StringPermutations(false);
        permGenerator.generatePermutations(null);
    }
}