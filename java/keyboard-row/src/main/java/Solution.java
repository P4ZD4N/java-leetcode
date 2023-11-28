import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] findWords(String[] words) {
        if (
                ((words.length >= 1) && (20 >= words.length)) &&
                checkWhetherAllWordsHaveCorrectLengths(words) &&
                checkWhetherAllWordsConsistsOfOnlyEnglishLetters(words)
        ) {
            List<String> wordList = List.of(words);

            List<String> firstRowOfKeyboard = List.of("qwertyuiop".split(""));
            List<String> secondRowOfKeyboard = List.of("asdfghjkl".split(""));
            List<String> thirdRowOfKeyboard = List.of("zxcvbnm".split(""));

            List<Integer> numbersOfLettersOfWordsThatAppearInFirstRow = createListOfLettersCountsInRow(wordList, firstRowOfKeyboard);
            List<Integer> numbersOfLettersOfWordsThatAppearInSecondRow = createListOfLettersCountsInRow(wordList, secondRowOfKeyboard);
            List<Integer> numbersOfLettersOfWordsThatAppearInThirdRow = createListOfLettersCountsInRow(wordList, thirdRowOfKeyboard);

            String[] foundWords = findWordsThatCanBeTypedUsingLettersOfOnlyOneRow(
                    wordList,
                    numbersOfLettersOfWordsThatAppearInFirstRow,
                    numbersOfLettersOfWordsThatAppearInSecondRow,
                    numbersOfLettersOfWordsThatAppearInThirdRow
            );

            return foundWords;
        } else {
            throw new IllegalArgumentException();
        }
    }
    private List<Integer> createListOfLettersCountsInRow(List<String> wordList, List<String> rowOfKeyboard) {
        List<Integer> numbersOfLettersOfWordsThatAppearInRow = new ArrayList<>();
        int numberOfLettersOfWordThatAppearInRow = 0;

        for (String word : wordList) {
            for (String letter : word.split("")) {
                if (rowOfKeyboard.contains(letter.toLowerCase())) {
                    numberOfLettersOfWordThatAppearInRow++;
                }
            }
            numbersOfLettersOfWordsThatAppearInRow.add(numberOfLettersOfWordThatAppearInRow);
            numberOfLettersOfWordThatAppearInRow = 0;
        }

        return numbersOfLettersOfWordsThatAppearInRow;
    }
    private String[] findWordsThatCanBeTypedUsingLettersOfOnlyOneRow(
            List<String> wordList,
            List<Integer> numbersOfLettersOfWordsThatAppearInFirstRow,
            List<Integer> numbersOfLettersOfWordsThatAppearInSecondRow,
            List<Integer> numbersOfLettersOfWordsThatAppearInThirdRow
    ) {
        List<String> foundWords = new ArrayList<>();

        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).length() == numbersOfLettersOfWordsThatAppearInFirstRow.get(i)) {
                foundWords.add(wordList.get(i));
            } else if (wordList.get(i).length() == numbersOfLettersOfWordsThatAppearInSecondRow.get(i)) {
                foundWords.add(wordList.get(i));
            } else if (wordList.get(i).length() == numbersOfLettersOfWordsThatAppearInThirdRow.get(i)) {
                foundWords.add(wordList.get(i));
            }
        }

        return foundWords.toArray(new String[0]);
    }
    private boolean checkWhetherAllWordsHaveCorrectLengths(String[] words) {
        List<Boolean> booleans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 1 && 100 >= words[i].length()) booleans.add(true);
            else booleans.add(false);
        }
        return !booleans.contains(false);
    }
    private boolean checkWhetherAllWordsConsistsOfOnlyEnglishLetters(String[] words) {
        List<Boolean> booleans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("[a-zA-Z]+")) booleans.add(true);
            else booleans.add(false);
        }
        return !booleans.contains(false);
    }
}
