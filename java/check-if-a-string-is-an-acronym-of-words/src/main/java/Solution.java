import java.util.List;

public class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if (
                listHasCorrectSize(words) &&
                allElementsOfListHaveCorrectSize(words) &&
                acronymHasCorrectSize(s) &&
                allElementsOfListAndAcronymConsistOfLowercaseEnglishLetters(words, s)
        ) {
            if (words.size() == s.length()) {
                String[] acronymLetters = s.split("");
                boolean isAcronym = true;
                for (int i = 0; i < words.size() && isAcronym; i++)
                    if (!(acronymLetters[i].equals(words.get(i).substring(0, 1))))
                        isAcronym = false;
                return isAcronym;
            } else
                return false;
        } else
            throw new IllegalArgumentException();
    }
    private boolean listHasCorrectSize(List<String> words) {
        return words.size() >= 1 && 100 >= words.size();
    }
    private boolean allElementsOfListHaveCorrectSize(List<String> words) {
        boolean allElementsOfListHaveCorrectSize = true;
        for (String word : words)
            if (!(word.length() >= 1 && 10 >= word.length()))
                allElementsOfListHaveCorrectSize = false;
        return allElementsOfListHaveCorrectSize;
    }
    private boolean acronymHasCorrectSize(String acronym) {
        return acronym.length() >= 1 && 100 >= acronym.length();
    }
    private boolean allElementsOfListAndAcronymConsistOfLowercaseEnglishLetters(List<String> words, String acronym) {
        boolean allElementsOfListAndAcronymConsistOfLowercaseEnglishLetters = true;
        for (String word : words)
            if (!(word.matches("[a-z]+")))
                allElementsOfListAndAcronymConsistOfLowercaseEnglishLetters = false;
        if (!(acronym.matches("[a-z]+")))
            allElementsOfListAndAcronymConsistOfLowercaseEnglishLetters = false;
        return allElementsOfListAndAcronymConsistOfLowercaseEnglishLetters;
    }
}
