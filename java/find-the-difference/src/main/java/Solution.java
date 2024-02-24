import java.util.Arrays;

public class Solution {
    public char findTheDifference(String s, String t) {
        if (!(hasFirstStringCorrectLength(s) && isSecondStringLengthGreaterBy1(s, t)))
            throw new IllegalArgumentException("Illegal argument");

        char[] firstStringToSortedCharArray = getStringToSortedCharArray(s);
        char[] secondStringToSortedCharArray = getStringToSortedCharArray(t);

        return getWantedChar(firstStringToSortedCharArray, secondStringToSortedCharArray);
    }

    private boolean hasFirstStringCorrectLength(String firstString) {
        return 1000 >= firstString.length();
    }

    private boolean isSecondStringLengthGreaterBy1(String firstString, String secondString) {
        return secondString.length() == firstString.length() + 1;
    }

    private char[] getStringToSortedCharArray(String str) {
        return getSortedArray(str.toCharArray());
    }

    private char[] getSortedArray(char[] array) {
        Arrays.sort(array);
        return array;
    }

    private char getWantedChar(char[] firstStringToSortedCharArray, char[] secondStringToSortedCharArray) {
        boolean notFoundDifference = true;
        int indexOfWantedChar = 0;

        for (int i = 0; i < firstStringToSortedCharArray.length && notFoundDifference; i++) {
            if (isCharAtThisPositionDifferentInBothArrays(
                    firstStringToSortedCharArray[i], secondStringToSortedCharArray[i])) {
                indexOfWantedChar = i;
                notFoundDifference = false;
            } else if (isLastIterationAndCharAtThisPositionSameInBothArrays(
                    i, firstStringToSortedCharArray, secondStringToSortedCharArray)) {
                indexOfWantedChar = i + 1;
                notFoundDifference = false;
            }
        }

        return secondStringToSortedCharArray[indexOfWantedChar];
    }

    private boolean isCharAtThisPositionDifferentInBothArrays(char first, char second) {
        return first != second;
    }

    private boolean isLastIterationAndCharAtThisPositionSameInBothArrays(
            int iteration, char[] firstStringToSortedCharArray, char[] secondStringToSortedCharArray
    ) {
        return iteration == firstStringToSortedCharArray.length - 1 && secondStringToSortedCharArray[iteration] == firstStringToSortedCharArray[iteration];
    }
}
