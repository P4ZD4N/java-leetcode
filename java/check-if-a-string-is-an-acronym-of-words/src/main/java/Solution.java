import java.util.List;

public class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() == s.length()) {
            String[] letters = s.split("");
            boolean result = true;
            for (int i = 0; i < words.size() && result; i++)
                if (!(letters[i].equals(words.get(i).substring(0,1))))
                    result = false;
            return result;
        } else {
            return false;
        }
    }
}
