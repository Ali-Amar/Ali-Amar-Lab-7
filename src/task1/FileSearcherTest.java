package task1;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class FileSearcherTest {
    
    @Test
    public void testFileSearch() {
        FileSearcher searcher = new FileSearcher(true);
        // Replace with an actual path on your system
        List<String> results = searcher.searchFile("C:\\Users\\aamar.bese22seecs\\Documents\\Recursion\\src\\task1", "test1.txt");
        assertNotNull(results);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidDirectory() {
        FileSearcher searcher = new FileSearcher(true);
        searcher.searchFile("nonexistent/path", "test.txt");
    }
}