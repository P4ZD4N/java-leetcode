import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        if (
                arraysHaveCorrectSizes(score) &&
                allElementsOfArrayAreCorrect(score) &&
                arrayConsistsOfOnlyDistinctIntegers(score) &&
                kIsCorrect(score, k)
        ) {
            int[] scoresOfKthExam = extractScoresOfKthExamToArray(score, k);
            int[][] sorted = new int[score.length][score[0].length];
            int indexOfBiggestScore = 0;
            int indexToAddBiggestScore = 0;
            int biggestScore = 0;

            while (!allElementsEqual0(scoresOfKthExam)) {
                for (int i = 0; i < scoresOfKthExam.length; i++) {
                    if (scoresOfKthExam[i] > biggestScore) {
                        biggestScore = scoresOfKthExam[i];
                        indexOfBiggestScore = i;
                    }
                }
                sorted[indexToAddBiggestScore++] = score[indexOfBiggestScore];
                scoresOfKthExam[indexOfBiggestScore] = 0;
                indexOfBiggestScore = 0;
                biggestScore = 0;
            }
            return sorted;
        } else
            throw new IllegalArgumentException();
    }
    private int[] extractScoresOfKthExamToArray(int[][] score, int k) {
        int[] scoresOfKthExam = new int[score.length];
        for (int i = 0; i < score.length; i++)
            for (int j = 0; j < score[i].length; j++)
                if (j == k)
                    scoresOfKthExam[i] = score[i][j];
        return scoresOfKthExam;
    }
    private boolean allElementsEqual0(int[] array) {
        int zerosCounter = 0;
        for (int i : array)
            if (i == 0)
                zerosCounter++;
        return array.length == zerosCounter;
    }
    private boolean arraysHaveCorrectSizes(int[][] score) {
        return (score.length >= 1 && 250 >= score.length) && (score[0].length >= 1 && 250 >= score[0].length);
    }
    private boolean allElementsOfArrayAreCorrect(int[][] array) {
        boolean result = true;
        for (int[] subarray : array)
            for (int element : subarray)
                if (!(element >= 1 && 100000 >= element)) {
                    result = false;
                    break;
                }
        return result;
    }
    private boolean arrayConsistsOfOnlyDistinctIntegers(int[][] array) {
        Set<Integer> set = new HashSet<>();
        int elements = 0;
        for (int[] subarray : array) {
            for (int i : subarray) {
                set.add(Integer.valueOf(i));
                elements++;
            }
        }
        return elements == set.size();
    }
    private boolean kIsCorrect(int[][] score, int k) {
        return k >= 0 && score[0].length > k;
    }
}