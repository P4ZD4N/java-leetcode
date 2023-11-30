import java.util.Arrays;

public class Solution {
    public int heightChecker(int[] heights) {
        int[] sortedHeights = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sortedHeights);
        return findNumberOfIncorrectStandingStudents(heights, sortedHeights);
    }
    private int findNumberOfIncorrectStandingStudents(int[] firstArray, int[] secondArray) {
        int numberOfIncorrectStandingStudents = 0;
        for (int i = 0; i < firstArray.length; i++)
            if (firstArray[i] != secondArray[i])
                numberOfIncorrectStandingStudents++;
        return numberOfIncorrectStandingStudents;
    }
}
