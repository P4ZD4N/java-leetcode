import java.util.*;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        if (((300 >= pattern.length()) && (pattern.length() >= 1)) && ((3000 >= s.length()) && (s.length() >= 1))) {
            List<String> wordsInString = List.of(s.split(" "));
            List<String> allKeys = List.of(pattern.split(""));
            LinkedHashSet<String> uniqueKeys = new LinkedHashSet<>(allKeys);
            LinkedHashMap<String, String> uniqueKeysWithAssignedWords = assignKeysToAppropriateValues(uniqueKeys, wordsInString);
            List<String> stringAccordingToThePattern = createStringAccordingToThePattern(
                    allKeys, uniqueKeys, uniqueKeysWithAssignedWords
            );
            return String.join(" ", stringAccordingToThePattern).equals(s);
        } else {
            throw new IllegalArgumentException();
        }
    }
    private LinkedHashMap<String, String> assignKeysToAppropriateValues(
            LinkedHashSet<String> uniqueKeys, List<String> values
    ) {
        LinkedHashMap<String, String> keysWithAppropriateValues = new LinkedHashMap<>();
        for (String key : uniqueKeys) {
            for (String value : values) {
                if (!(keysWithAppropriateValues.containsKey(key)) && !(keysWithAppropriateValues.containsValue(value))) {
                    keysWithAppropriateValues.put(key, value);
                }
            }
        }
        return keysWithAppropriateValues;
    }
    private List<String> createStringAccordingToThePattern(
            List<String> allKeys, LinkedHashSet<String> uniqueKeys, LinkedHashMap<String, String> uniqueKeysWithAssignedWords
    ) {
        List<String> stringAccordingToThePattern = new ArrayList<>();
        for (String key : allKeys) {
            for (String uniqueKey : uniqueKeys) {
                if (uniqueKey.equals(key)) {
                    stringAccordingToThePattern.add(uniqueKeysWithAssignedWords.get(uniqueKey));
                }
            }
        }
        return stringAccordingToThePattern;
    }
}
