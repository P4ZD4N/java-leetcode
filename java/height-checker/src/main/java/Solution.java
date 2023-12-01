import java.util.Arrays;

public class Solution {
    public int heightChecker(int[] heights) {
        if (hasArrayCorrectLength(heights) && areAllElementsBelongToCorrectRange(heights)) {
            int[] sortedHeights = Arrays.copyOf(heights, heights.length);
            Arrays.sort(sortedHeights);
            return findNumberOfIncorrectStandingStudents(heights, sortedHeights);
        } else {
            throw new IllegalArgumentException();
        }

    }
    private int findNumberOfIncorrectStandingStudents(int[] firstArray, int[] secondArray) {
        int numberOfIncorrectStandingStudents = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                numberOfIncorrectStandingStudents++;
            }
        }
        return numberOfIncorrectStandingStudents;
    }
    private boolean hasArrayCorrectLength(int[] array) {
        return array.length >= 1 && 100 >= array.length;
    }
    private boolean areAllElementsBelongToCorrectRange(int[] array) {
        boolean areAllElementsBelongToCorrectRange = true;
        for (int i = 0; i < array.length && areAllElementsBelongToCorrectRange; i++) {
            if (!(array[i] >= 1 && 100 >= array[i])) {
                areAllElementsBelongToCorrectRange = false;
            }
        }
        return areAllElementsBelongToCorrectRange;
    }
}
