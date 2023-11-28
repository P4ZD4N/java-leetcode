import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String reverseWords(String s) {
        if(s.isEmpty()) {
            throw new IllegalArgumentException("String must contain at least one word");
        } else {
            if (doesStringContainsLeadingOrTrailingSpaces(s)) {
                throw new IllegalArgumentException("String contains leading or trailing spaces");
            } else {
                String[] wordsInString = s.split(" ");
                return String.join(" ", reverseWordsInString(wordsInString));
            }
        }
    }
    private boolean doesStringContainsLeadingOrTrailingSpaces(String s) {
        return ((s.substring(0, 1).equals(" ")) || (s.substring(s.length() - 1, s.length()).equals(" ")));
    }
    private List<String> reverseWordsInString(String[] wordsInString) {
        List<String> reversedWords = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (String word: wordsInString) {
            sb.append(word);
            sb.reverse();
            reversedWords.add(sb.toString());
            sb.setLength(0);
        }
        return reversedWords;
    }
}
