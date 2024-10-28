package task1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSearcher {
    private boolean caseSensitive;
    private int occurrenceCount;
    private List<String> foundPaths;
    
    public FileSearcher(boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        this.occurrenceCount = 0;
        this.foundPaths = new ArrayList<>();
    }
    
    public List<String> searchFile(String directoryPath, String fileName) {
        File directory = new File(directoryPath);
        
        if (!directory.exists()) {
            throw new IllegalArgumentException("Directory does not exist: " + directoryPath);
        }
        
        if (!directory.isDirectory()) {
            throw new IllegalArgumentException("Path is not a directory: " + directoryPath);
        }
        
        searchFileRecursive(directory, fileName);
        return foundPaths;
    }
    
    private void searchFileRecursive(File directory, String fileName) {
        File[] files = directory.listFiles();
        
        if (files == null) {
            return;
        }
        
        for (File file : files) {
            if (file.isFile()) {
                String currentFileName = file.getName();
                if (caseSensitive ? currentFileName.equals(fileName) 
                                : currentFileName.equalsIgnoreCase(fileName)) {
                    foundPaths.add(file.getAbsolutePath());
                    occurrenceCount++;
                }
            } else if (file.isDirectory()) {
                searchFileRecursive(file, fileName);
            }
        }
    }
    
    public int getOccurrenceCount() {
        return occurrenceCount;
    }
}