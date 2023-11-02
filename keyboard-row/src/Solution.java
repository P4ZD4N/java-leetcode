import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] findWords(String[] words) {
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
}
